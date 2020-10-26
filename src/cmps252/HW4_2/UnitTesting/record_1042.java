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

@Tag("39")
class Record_1042 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1042: FirstName is Neal")
	void FirstNameOfRecord1042() {
		assertEquals("Neal", customers.get(1041).getFirstName());
	}

	@Test
	@DisplayName("Record 1042: LastName is Shamlin")
	void LastNameOfRecord1042() {
		assertEquals("Shamlin", customers.get(1041).getLastName());
	}

	@Test
	@DisplayName("Record 1042: Company is Anderson, Erik A Esq")
	void CompanyOfRecord1042() {
		assertEquals("Anderson, Erik A Esq", customers.get(1041).getCompany());
	}

	@Test
	@DisplayName("Record 1042: Address is 3910 Bristol Pk")
	void AddressOfRecord1042() {
		assertEquals("3910 Bristol Pk", customers.get(1041).getAddress());
	}

	@Test
	@DisplayName("Record 1042: City is Bensalem")
	void CityOfRecord1042() {
		assertEquals("Bensalem", customers.get(1041).getCity());
	}

	@Test
	@DisplayName("Record 1042: County is Bucks")
	void CountyOfRecord1042() {
		assertEquals("Bucks", customers.get(1041).getCounty());
	}

	@Test
	@DisplayName("Record 1042: State is PA")
	void StateOfRecord1042() {
		assertEquals("PA", customers.get(1041).getState());
	}

	@Test
	@DisplayName("Record 1042: ZIP is 19020")
	void ZIPOfRecord1042() {
		assertEquals("19020", customers.get(1041).getZIP());
	}

	@Test
	@DisplayName("Record 1042: Phone is 215-245-3639")
	void PhoneOfRecord1042() {
		assertEquals("215-245-3639", customers.get(1041).getPhone());
	}

	@Test
	@DisplayName("Record 1042: Fax is 215-245-9988")
	void FaxOfRecord1042() {
		assertEquals("215-245-9988", customers.get(1041).getFax());
	}

	@Test
	@DisplayName("Record 1042: Email is neal@shamlin.com")
	void EmailOfRecord1042() {
		assertEquals("neal@shamlin.com", customers.get(1041).getEmail());
	}

	@Test
	@DisplayName("Record 1042: Web is http://www.nealshamlin.com")
	void WebOfRecord1042() {
		assertEquals("http://www.nealshamlin.com", customers.get(1041).getWeb());
	}
}
