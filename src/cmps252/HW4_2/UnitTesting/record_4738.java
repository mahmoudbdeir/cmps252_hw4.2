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

@Tag("7")
class Record_4738 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4738: FirstName is Muriel")
	void FirstNameOfRecord4738() {
		assertEquals("Muriel", customers.get(4737).getFirstName());
	}

	@Test
	@DisplayName("Record 4738: LastName is Grattelo")
	void LastNameOfRecord4738() {
		assertEquals("Grattelo", customers.get(4737).getLastName());
	}

	@Test
	@DisplayName("Record 4738: Company is Herndon, Howard W Esq")
	void CompanyOfRecord4738() {
		assertEquals("Herndon, Howard W Esq", customers.get(4737).getCompany());
	}

	@Test
	@DisplayName("Record 4738: Address is 837 N Mitchell St")
	void AddressOfRecord4738() {
		assertEquals("837 N Mitchell St", customers.get(4737).getAddress());
	}

	@Test
	@DisplayName("Record 4738: City is Cadillac")
	void CityOfRecord4738() {
		assertEquals("Cadillac", customers.get(4737).getCity());
	}

	@Test
	@DisplayName("Record 4738: County is Wexford")
	void CountyOfRecord4738() {
		assertEquals("Wexford", customers.get(4737).getCounty());
	}

	@Test
	@DisplayName("Record 4738: State is MI")
	void StateOfRecord4738() {
		assertEquals("MI", customers.get(4737).getState());
	}

	@Test
	@DisplayName("Record 4738: ZIP is 49601")
	void ZIPOfRecord4738() {
		assertEquals("49601", customers.get(4737).getZIP());
	}

	@Test
	@DisplayName("Record 4738: Phone is 231-775-6764")
	void PhoneOfRecord4738() {
		assertEquals("231-775-6764", customers.get(4737).getPhone());
	}

	@Test
	@DisplayName("Record 4738: Fax is 231-775-5698")
	void FaxOfRecord4738() {
		assertEquals("231-775-5698", customers.get(4737).getFax());
	}

	@Test
	@DisplayName("Record 4738: Email is muriel@grattelo.com")
	void EmailOfRecord4738() {
		assertEquals("muriel@grattelo.com", customers.get(4737).getEmail());
	}

	@Test
	@DisplayName("Record 4738: Web is http://www.murielgrattelo.com")
	void WebOfRecord4738() {
		assertEquals("http://www.murielgrattelo.com", customers.get(4737).getWeb());
	}
}
