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

@Tag("6")
class Record_270 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 270: FirstName is Frances")
	void FirstNameOfRecord270() {
		assertEquals("Frances", customers.get(269).getFirstName());
	}

	@Test
	@DisplayName("Record 270: LastName is Matalka")
	void LastNameOfRecord270() {
		assertEquals("Matalka", customers.get(269).getLastName());
	}

	@Test
	@DisplayName("Record 270: Company is Palmer Shile Rack Distributors")
	void CompanyOfRecord270() {
		assertEquals("Palmer Shile Rack Distributors", customers.get(269).getCompany());
	}

	@Test
	@DisplayName("Record 270: Address is 139 N Cotton St")
	void AddressOfRecord270() {
		assertEquals("139 N Cotton St", customers.get(269).getAddress());
	}

	@Test
	@DisplayName("Record 270: City is El Paso")
	void CityOfRecord270() {
		assertEquals("El Paso", customers.get(269).getCity());
	}

	@Test
	@DisplayName("Record 270: County is El Paso")
	void CountyOfRecord270() {
		assertEquals("El Paso", customers.get(269).getCounty());
	}

	@Test
	@DisplayName("Record 270: State is TX")
	void StateOfRecord270() {
		assertEquals("TX", customers.get(269).getState());
	}

	@Test
	@DisplayName("Record 270: ZIP is 79901")
	void ZIPOfRecord270() {
		assertEquals("79901", customers.get(269).getZIP());
	}

	@Test
	@DisplayName("Record 270: Phone is 915-533-9098")
	void PhoneOfRecord270() {
		assertEquals("915-533-9098", customers.get(269).getPhone());
	}

	@Test
	@DisplayName("Record 270: Fax is 915-533-3207")
	void FaxOfRecord270() {
		assertEquals("915-533-3207", customers.get(269).getFax());
	}

	@Test
	@DisplayName("Record 270: Email is frances@matalka.com")
	void EmailOfRecord270() {
		assertEquals("frances@matalka.com", customers.get(269).getEmail());
	}

	@Test
	@DisplayName("Record 270: Web is http://www.francesmatalka.com")
	void WebOfRecord270() {
		assertEquals("http://www.francesmatalka.com", customers.get(269).getWeb());
	}
}
