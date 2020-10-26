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

@Tag("30")
class Record_3212 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3212: FirstName is Dollie")
	void FirstNameOfRecord3212() {
		assertEquals("Dollie", customers.get(3211).getFirstName());
	}

	@Test
	@DisplayName("Record 3212: LastName is Cussins")
	void LastNameOfRecord3212() {
		assertEquals("Cussins", customers.get(3211).getLastName());
	}

	@Test
	@DisplayName("Record 3212: Company is Johnston, J Richard Esq")
	void CompanyOfRecord3212() {
		assertEquals("Johnston, J Richard Esq", customers.get(3211).getCompany());
	}

	@Test
	@DisplayName("Record 3212: Address is 10 Roberts St")
	void AddressOfRecord3212() {
		assertEquals("10 Roberts St", customers.get(3211).getAddress());
	}

	@Test
	@DisplayName("Record 3212: City is Fargo")
	void CityOfRecord3212() {
		assertEquals("Fargo", customers.get(3211).getCity());
	}

	@Test
	@DisplayName("Record 3212: County is Cass")
	void CountyOfRecord3212() {
		assertEquals("Cass", customers.get(3211).getCounty());
	}

	@Test
	@DisplayName("Record 3212: State is ND")
	void StateOfRecord3212() {
		assertEquals("ND", customers.get(3211).getState());
	}

	@Test
	@DisplayName("Record 3212: ZIP is 58102")
	void ZIPOfRecord3212() {
		assertEquals("58102", customers.get(3211).getZIP());
	}

	@Test
	@DisplayName("Record 3212: Phone is 701-237-2578")
	void PhoneOfRecord3212() {
		assertEquals("701-237-2578", customers.get(3211).getPhone());
	}

	@Test
	@DisplayName("Record 3212: Fax is 701-237-2268")
	void FaxOfRecord3212() {
		assertEquals("701-237-2268", customers.get(3211).getFax());
	}

	@Test
	@DisplayName("Record 3212: Email is dollie@cussins.com")
	void EmailOfRecord3212() {
		assertEquals("dollie@cussins.com", customers.get(3211).getEmail());
	}

	@Test
	@DisplayName("Record 3212: Web is http://www.dolliecussins.com")
	void WebOfRecord3212() {
		assertEquals("http://www.dolliecussins.com", customers.get(3211).getWeb());
	}
}
