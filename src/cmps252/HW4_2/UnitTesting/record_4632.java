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

@Tag("19")
class Record_4632 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4632: FirstName is Bo")
	void FirstNameOfRecord4632() {
		assertEquals("Bo", customers.get(4631).getFirstName());
	}

	@Test
	@DisplayName("Record 4632: LastName is Klasinski")
	void LastNameOfRecord4632() {
		assertEquals("Klasinski", customers.get(4631).getLastName());
	}

	@Test
	@DisplayName("Record 4632: Company is Anmark Machine")
	void CompanyOfRecord4632() {
		assertEquals("Anmark Machine", customers.get(4631).getCompany());
	}

	@Test
	@DisplayName("Record 4632: Address is 130 Bay St")
	void AddressOfRecord4632() {
		assertEquals("130 Bay St", customers.get(4631).getAddress());
	}

	@Test
	@DisplayName("Record 4632: City is Jersey City")
	void CityOfRecord4632() {
		assertEquals("Jersey City", customers.get(4631).getCity());
	}

	@Test
	@DisplayName("Record 4632: County is Hudson")
	void CountyOfRecord4632() {
		assertEquals("Hudson", customers.get(4631).getCounty());
	}

	@Test
	@DisplayName("Record 4632: State is NJ")
	void StateOfRecord4632() {
		assertEquals("NJ", customers.get(4631).getState());
	}

	@Test
	@DisplayName("Record 4632: ZIP is 7302")
	void ZIPOfRecord4632() {
		assertEquals("7302", customers.get(4631).getZIP());
	}

	@Test
	@DisplayName("Record 4632: Phone is 201-653-2466")
	void PhoneOfRecord4632() {
		assertEquals("201-653-2466", customers.get(4631).getPhone());
	}

	@Test
	@DisplayName("Record 4632: Fax is 201-653-6429")
	void FaxOfRecord4632() {
		assertEquals("201-653-6429", customers.get(4631).getFax());
	}

	@Test
	@DisplayName("Record 4632: Email is bo@klasinski.com")
	void EmailOfRecord4632() {
		assertEquals("bo@klasinski.com", customers.get(4631).getEmail());
	}

	@Test
	@DisplayName("Record 4632: Web is http://www.boklasinski.com")
	void WebOfRecord4632() {
		assertEquals("http://www.boklasinski.com", customers.get(4631).getWeb());
	}
}
