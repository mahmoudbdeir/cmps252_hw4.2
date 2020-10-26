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

@Tag("42")
class Record_4239 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4239: FirstName is Willa")
	void FirstNameOfRecord4239() {
		assertEquals("Willa", customers.get(4238).getFirstName());
	}

	@Test
	@DisplayName("Record 4239: LastName is Littlefield")
	void LastNameOfRecord4239() {
		assertEquals("Littlefield", customers.get(4238).getLastName());
	}

	@Test
	@DisplayName("Record 4239: Company is Alfredo The Original Of Rome")
	void CompanyOfRecord4239() {
		assertEquals("Alfredo The Original Of Rome", customers.get(4238).getCompany());
	}

	@Test
	@DisplayName("Record 4239: Address is 182 Webster Dr")
	void AddressOfRecord4239() {
		assertEquals("182 Webster Dr", customers.get(4238).getAddress());
	}

	@Test
	@DisplayName("Record 4239: City is Wayne")
	void CityOfRecord4239() {
		assertEquals("Wayne", customers.get(4238).getCity());
	}

	@Test
	@DisplayName("Record 4239: County is Passaic")
	void CountyOfRecord4239() {
		assertEquals("Passaic", customers.get(4238).getCounty());
	}

	@Test
	@DisplayName("Record 4239: State is NJ")
	void StateOfRecord4239() {
		assertEquals("NJ", customers.get(4238).getState());
	}

	@Test
	@DisplayName("Record 4239: ZIP is 7470")
	void ZIPOfRecord4239() {
		assertEquals("7470", customers.get(4238).getZIP());
	}

	@Test
	@DisplayName("Record 4239: Phone is 973-628-5467")
	void PhoneOfRecord4239() {
		assertEquals("973-628-5467", customers.get(4238).getPhone());
	}

	@Test
	@DisplayName("Record 4239: Fax is 973-628-9914")
	void FaxOfRecord4239() {
		assertEquals("973-628-9914", customers.get(4238).getFax());
	}

	@Test
	@DisplayName("Record 4239: Email is willa@littlefield.com")
	void EmailOfRecord4239() {
		assertEquals("willa@littlefield.com", customers.get(4238).getEmail());
	}

	@Test
	@DisplayName("Record 4239: Web is http://www.willalittlefield.com")
	void WebOfRecord4239() {
		assertEquals("http://www.willalittlefield.com", customers.get(4238).getWeb());
	}
}
