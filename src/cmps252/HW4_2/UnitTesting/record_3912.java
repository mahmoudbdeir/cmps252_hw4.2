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

@Tag("18")
class Record_3912 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3912: FirstName is Nannie")
	void FirstNameOfRecord3912() {
		assertEquals("Nannie", customers.get(3911).getFirstName());
	}

	@Test
	@DisplayName("Record 3912: LastName is Affelt")
	void LastNameOfRecord3912() {
		assertEquals("Affelt", customers.get(3911).getLastName());
	}

	@Test
	@DisplayName("Record 3912: Company is Medclaim Management Services")
	void CompanyOfRecord3912() {
		assertEquals("Medclaim Management Services", customers.get(3911).getCompany());
	}

	@Test
	@DisplayName("Record 3912: Address is 1211 Sw 5th Ave")
	void AddressOfRecord3912() {
		assertEquals("1211 Sw 5th Ave", customers.get(3911).getAddress());
	}

	@Test
	@DisplayName("Record 3912: City is Portland")
	void CityOfRecord3912() {
		assertEquals("Portland", customers.get(3911).getCity());
	}

	@Test
	@DisplayName("Record 3912: County is Multnomah")
	void CountyOfRecord3912() {
		assertEquals("Multnomah", customers.get(3911).getCounty());
	}

	@Test
	@DisplayName("Record 3912: State is OR")
	void StateOfRecord3912() {
		assertEquals("OR", customers.get(3911).getState());
	}

	@Test
	@DisplayName("Record 3912: ZIP is 97204")
	void ZIPOfRecord3912() {
		assertEquals("97204", customers.get(3911).getZIP());
	}

	@Test
	@DisplayName("Record 3912: Phone is 503-796-3207")
	void PhoneOfRecord3912() {
		assertEquals("503-796-3207", customers.get(3911).getPhone());
	}

	@Test
	@DisplayName("Record 3912: Fax is 503-796-2604")
	void FaxOfRecord3912() {
		assertEquals("503-796-2604", customers.get(3911).getFax());
	}

	@Test
	@DisplayName("Record 3912: Email is nannie@affelt.com")
	void EmailOfRecord3912() {
		assertEquals("nannie@affelt.com", customers.get(3911).getEmail());
	}

	@Test
	@DisplayName("Record 3912: Web is http://www.nannieaffelt.com")
	void WebOfRecord3912() {
		assertEquals("http://www.nannieaffelt.com", customers.get(3911).getWeb());
	}
}
