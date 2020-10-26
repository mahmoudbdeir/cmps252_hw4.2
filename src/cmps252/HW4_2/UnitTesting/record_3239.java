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

@Tag("15")
class Record_3239 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3239: FirstName is Jacqueline")
	void FirstNameOfRecord3239() {
		assertEquals("Jacqueline", customers.get(3238).getFirstName());
	}

	@Test
	@DisplayName("Record 3239: LastName is Martinas")
	void LastNameOfRecord3239() {
		assertEquals("Martinas", customers.get(3238).getLastName());
	}

	@Test
	@DisplayName("Record 3239: Company is Assn Orth Bright Teachers")
	void CompanyOfRecord3239() {
		assertEquals("Assn Orth Bright Teachers", customers.get(3238).getCompany());
	}

	@Test
	@DisplayName("Record 3239: Address is 916 E Baseline Rd  #-101")
	void AddressOfRecord3239() {
		assertEquals("916 E Baseline Rd  #-101", customers.get(3238).getAddress());
	}

	@Test
	@DisplayName("Record 3239: City is Mesa")
	void CityOfRecord3239() {
		assertEquals("Mesa", customers.get(3238).getCity());
	}

	@Test
	@DisplayName("Record 3239: County is Maricopa")
	void CountyOfRecord3239() {
		assertEquals("Maricopa", customers.get(3238).getCounty());
	}

	@Test
	@DisplayName("Record 3239: State is AZ")
	void StateOfRecord3239() {
		assertEquals("AZ", customers.get(3238).getState());
	}

	@Test
	@DisplayName("Record 3239: ZIP is 85204")
	void ZIPOfRecord3239() {
		assertEquals("85204", customers.get(3238).getZIP());
	}

	@Test
	@DisplayName("Record 3239: Phone is 480-545-9985")
	void PhoneOfRecord3239() {
		assertEquals("480-545-9985", customers.get(3238).getPhone());
	}

	@Test
	@DisplayName("Record 3239: Fax is 480-545-9789")
	void FaxOfRecord3239() {
		assertEquals("480-545-9789", customers.get(3238).getFax());
	}

	@Test
	@DisplayName("Record 3239: Email is jacqueline@martinas.com")
	void EmailOfRecord3239() {
		assertEquals("jacqueline@martinas.com", customers.get(3238).getEmail());
	}

	@Test
	@DisplayName("Record 3239: Web is http://www.jacquelinemartinas.com")
	void WebOfRecord3239() {
		assertEquals("http://www.jacquelinemartinas.com", customers.get(3238).getWeb());
	}
}
