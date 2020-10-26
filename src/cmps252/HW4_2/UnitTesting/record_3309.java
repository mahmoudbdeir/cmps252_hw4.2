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
class Record_3309 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3309: FirstName is Adalberto")
	void FirstNameOfRecord3309() {
		assertEquals("Adalberto", customers.get(3308).getFirstName());
	}

	@Test
	@DisplayName("Record 3309: LastName is Vandehy")
	void LastNameOfRecord3309() {
		assertEquals("Vandehy", customers.get(3308).getLastName());
	}

	@Test
	@DisplayName("Record 3309: Company is Moore, Edward H Esq")
	void CompanyOfRecord3309() {
		assertEquals("Moore, Edward H Esq", customers.get(3308).getCompany());
	}

	@Test
	@DisplayName("Record 3309: Address is 700 Fourth Financial Cent")
	void AddressOfRecord3309() {
		assertEquals("700 Fourth Financial Cent", customers.get(3308).getAddress());
	}

	@Test
	@DisplayName("Record 3309: City is Wichita")
	void CityOfRecord3309() {
		assertEquals("Wichita", customers.get(3308).getCity());
	}

	@Test
	@DisplayName("Record 3309: County is Sedgwick")
	void CountyOfRecord3309() {
		assertEquals("Sedgwick", customers.get(3308).getCounty());
	}

	@Test
	@DisplayName("Record 3309: State is KS")
	void StateOfRecord3309() {
		assertEquals("KS", customers.get(3308).getState());
	}

	@Test
	@DisplayName("Record 3309: ZIP is 67202")
	void ZIPOfRecord3309() {
		assertEquals("67202", customers.get(3308).getZIP());
	}

	@Test
	@DisplayName("Record 3309: Phone is 316-267-9667")
	void PhoneOfRecord3309() {
		assertEquals("316-267-9667", customers.get(3308).getPhone());
	}

	@Test
	@DisplayName("Record 3309: Fax is 316-267-3398")
	void FaxOfRecord3309() {
		assertEquals("316-267-3398", customers.get(3308).getFax());
	}

	@Test
	@DisplayName("Record 3309: Email is adalberto@vandehy.com")
	void EmailOfRecord3309() {
		assertEquals("adalberto@vandehy.com", customers.get(3308).getEmail());
	}

	@Test
	@DisplayName("Record 3309: Web is http://www.adalbertovandehy.com")
	void WebOfRecord3309() {
		assertEquals("http://www.adalbertovandehy.com", customers.get(3308).getWeb());
	}
}
