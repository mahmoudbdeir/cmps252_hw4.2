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
class Record_3224 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3224: FirstName is Debbie")
	void FirstNameOfRecord3224() {
		assertEquals("Debbie", customers.get(3223).getFirstName());
	}

	@Test
	@DisplayName("Record 3224: LastName is Mcguinness")
	void LastNameOfRecord3224() {
		assertEquals("Mcguinness", customers.get(3223).getLastName());
	}

	@Test
	@DisplayName("Record 3224: Company is Sherman Pharm Inc None")
	void CompanyOfRecord3224() {
		assertEquals("Sherman Pharm Inc None", customers.get(3223).getCompany());
	}

	@Test
	@DisplayName("Record 3224: Address is 1005 4th St")
	void AddressOfRecord3224() {
		assertEquals("1005 4th St", customers.get(3223).getAddress());
	}

	@Test
	@DisplayName("Record 3224: City is Sioux City")
	void CityOfRecord3224() {
		assertEquals("Sioux City", customers.get(3223).getCity());
	}

	@Test
	@DisplayName("Record 3224: County is Woodbury")
	void CountyOfRecord3224() {
		assertEquals("Woodbury", customers.get(3223).getCounty());
	}

	@Test
	@DisplayName("Record 3224: State is IA")
	void StateOfRecord3224() {
		assertEquals("IA", customers.get(3223).getState());
	}

	@Test
	@DisplayName("Record 3224: ZIP is 51101")
	void ZIPOfRecord3224() {
		assertEquals("51101", customers.get(3223).getZIP());
	}

	@Test
	@DisplayName("Record 3224: Phone is 712-252-7975")
	void PhoneOfRecord3224() {
		assertEquals("712-252-7975", customers.get(3223).getPhone());
	}

	@Test
	@DisplayName("Record 3224: Fax is 712-252-3491")
	void FaxOfRecord3224() {
		assertEquals("712-252-3491", customers.get(3223).getFax());
	}

	@Test
	@DisplayName("Record 3224: Email is debbie@mcguinness.com")
	void EmailOfRecord3224() {
		assertEquals("debbie@mcguinness.com", customers.get(3223).getEmail());
	}

	@Test
	@DisplayName("Record 3224: Web is http://www.debbiemcguinness.com")
	void WebOfRecord3224() {
		assertEquals("http://www.debbiemcguinness.com", customers.get(3223).getWeb());
	}
}
