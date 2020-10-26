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

@Tag("29")
class Record_4102 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4102: FirstName is Mia")
	void FirstNameOfRecord4102() {
		assertEquals("Mia", customers.get(4101).getFirstName());
	}

	@Test
	@DisplayName("Record 4102: LastName is Lundsten")
	void LastNameOfRecord4102() {
		assertEquals("Lundsten", customers.get(4101).getLastName());
	}

	@Test
	@DisplayName("Record 4102: Company is Jakaitis, Gary J Esq")
	void CompanyOfRecord4102() {
		assertEquals("Jakaitis, Gary J Esq", customers.get(4101).getCompany());
	}

	@Test
	@DisplayName("Record 4102: Address is 6 Hollywood Ct")
	void AddressOfRecord4102() {
		assertEquals("6 Hollywood Ct", customers.get(4101).getAddress());
	}

	@Test
	@DisplayName("Record 4102: City is South Plainfield")
	void CityOfRecord4102() {
		assertEquals("South Plainfield", customers.get(4101).getCity());
	}

	@Test
	@DisplayName("Record 4102: County is Middlesex")
	void CountyOfRecord4102() {
		assertEquals("Middlesex", customers.get(4101).getCounty());
	}

	@Test
	@DisplayName("Record 4102: State is NJ")
	void StateOfRecord4102() {
		assertEquals("NJ", customers.get(4101).getState());
	}

	@Test
	@DisplayName("Record 4102: ZIP is 7080")
	void ZIPOfRecord4102() {
		assertEquals("7080", customers.get(4101).getZIP());
	}

	@Test
	@DisplayName("Record 4102: Phone is 908-754-7480")
	void PhoneOfRecord4102() {
		assertEquals("908-754-7480", customers.get(4101).getPhone());
	}

	@Test
	@DisplayName("Record 4102: Fax is 908-754-6115")
	void FaxOfRecord4102() {
		assertEquals("908-754-6115", customers.get(4101).getFax());
	}

	@Test
	@DisplayName("Record 4102: Email is mia@lundsten.com")
	void EmailOfRecord4102() {
		assertEquals("mia@lundsten.com", customers.get(4101).getEmail());
	}

	@Test
	@DisplayName("Record 4102: Web is http://www.mialundsten.com")
	void WebOfRecord4102() {
		assertEquals("http://www.mialundsten.com", customers.get(4101).getWeb());
	}
}
