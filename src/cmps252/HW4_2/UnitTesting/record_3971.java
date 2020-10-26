package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("23")
class Record_3971 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3971: FirstName is Marcos")
	void FirstNameOfRecord3971() {
		assertEquals("Marcos", customers.get(3970).getFirstName());
	}

	@Test
	@DisplayName("Record 3971: LastName is Mccleaf")
	void LastNameOfRecord3971() {
		assertEquals("Mccleaf", customers.get(3970).getLastName());
	}

	@Test
	@DisplayName("Record 3971: Company is Marmon Keystone Corporation")
	void CompanyOfRecord3971() {
		assertEquals("Marmon Keystone Corporation", customers.get(3970).getCompany());
	}

	@Test
	@DisplayName("Record 3971: Address is Kentucky Home Life")
	void AddressOfRecord3971() {
		assertEquals("Kentucky Home Life", customers.get(3970).getAddress());
	}

	@Test
	@DisplayName("Record 3971: City is Louisville")
	void CityOfRecord3971() {
		assertEquals("Louisville", customers.get(3970).getCity());
	}

	@Test
	@DisplayName("Record 3971: County is Jefferson")
	void CountyOfRecord3971() {
		assertEquals("Jefferson", customers.get(3970).getCounty());
	}

	@Test
	@DisplayName("Record 3971: State is KY")
	void StateOfRecord3971() {
		assertEquals("KY", customers.get(3970).getState());
	}

	@Test
	@DisplayName("Record 3971: ZIP is 40202")
	void ZIPOfRecord3971() {
		assertEquals("40202", customers.get(3970).getZIP());
	}

	@Test
	@DisplayName("Record 3971: Phone is 502-587-2701")
	void PhoneOfRecord3971() {
		assertEquals("502-587-2701", customers.get(3970).getPhone());
	}

	@Test
	@DisplayName("Record 3971: Fax is 502-587-3094")
	void FaxOfRecord3971() {
		assertEquals("502-587-3094", customers.get(3970).getFax());
	}

	@Test
	@DisplayName("Record 3971: Email is marcos@mccleaf.com")
	void EmailOfRecord3971() {
		assertEquals("marcos@mccleaf.com", customers.get(3970).getEmail());
	}

	@Test
	@DisplayName("Record 3971: Web is http://www.marcosmccleaf.com")
	void WebOfRecord3971() {
		assertEquals("http://www.marcosmccleaf.com", customers.get(3970).getWeb());
	}
}
