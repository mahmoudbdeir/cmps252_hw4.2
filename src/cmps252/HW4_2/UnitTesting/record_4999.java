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

@Tag("12")
class Record_4999 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4999: FirstName is Madonna")
	void FirstNameOfRecord4999() {
		assertEquals("Madonna", customers.get(4998).getFirstName());
	}

	@Test
	@DisplayName("Record 4999: LastName is Gillam")
	void LastNameOfRecord4999() {
		assertEquals("Gillam", customers.get(4998).getLastName());
	}

	@Test
	@DisplayName("Record 4999: Company is Barker, Andrew M Esq")
	void CompanyOfRecord4999() {
		assertEquals("Barker, Andrew M Esq", customers.get(4998).getCompany());
	}

	@Test
	@DisplayName("Record 4999: Address is 2730 Middlebury St")
	void AddressOfRecord4999() {
		assertEquals("2730 Middlebury St", customers.get(4998).getAddress());
	}

	@Test
	@DisplayName("Record 4999: City is Elkhart")
	void CityOfRecord4999() {
		assertEquals("Elkhart", customers.get(4998).getCity());
	}

	@Test
	@DisplayName("Record 4999: County is Elkhart")
	void CountyOfRecord4999() {
		assertEquals("Elkhart", customers.get(4998).getCounty());
	}

	@Test
	@DisplayName("Record 4999: State is IN")
	void StateOfRecord4999() {
		assertEquals("IN", customers.get(4998).getState());
	}

	@Test
	@DisplayName("Record 4999: ZIP is 46516")
	void ZIPOfRecord4999() {
		assertEquals("46516", customers.get(4998).getZIP());
	}

	@Test
	@DisplayName("Record 4999: Phone is 574-522-1363")
	void PhoneOfRecord4999() {
		assertEquals("574-522-1363", customers.get(4998).getPhone());
	}

	@Test
	@DisplayName("Record 4999: Fax is 574-522-0486")
	void FaxOfRecord4999() {
		assertEquals("574-522-0486", customers.get(4998).getFax());
	}

	@Test
	@DisplayName("Record 4999: Email is madonna@gillam.com")
	void EmailOfRecord4999() {
		assertEquals("madonna@gillam.com", customers.get(4998).getEmail());
	}

	@Test
	@DisplayName("Record 4999: Web is http://www.madonnagillam.com")
	void WebOfRecord4999() {
		assertEquals("http://www.madonnagillam.com", customers.get(4998).getWeb());
	}
}
