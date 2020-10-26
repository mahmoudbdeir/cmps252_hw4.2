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

@Tag("13")
class Record_1280 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1280: FirstName is Bobbie")
	void FirstNameOfRecord1280() {
		assertEquals("Bobbie", customers.get(1279).getFirstName());
	}

	@Test
	@DisplayName("Record 1280: LastName is Haymer")
	void LastNameOfRecord1280() {
		assertEquals("Haymer", customers.get(1279).getLastName());
	}

	@Test
	@DisplayName("Record 1280: Company is Allens Tv Cable Service Inc")
	void CompanyOfRecord1280() {
		assertEquals("Allens Tv Cable Service Inc", customers.get(1279).getCompany());
	}

	@Test
	@DisplayName("Record 1280: Address is 1215 Southeast Blvd")
	void AddressOfRecord1280() {
		assertEquals("1215 Southeast Blvd", customers.get(1279).getAddress());
	}

	@Test
	@DisplayName("Record 1280: City is Morgan City")
	void CityOfRecord1280() {
		assertEquals("Morgan City", customers.get(1279).getCity());
	}

	@Test
	@DisplayName("Record 1280: County is Saint Mary")
	void CountyOfRecord1280() {
		assertEquals("Saint Mary", customers.get(1279).getCounty());
	}

	@Test
	@DisplayName("Record 1280: State is LA")
	void StateOfRecord1280() {
		assertEquals("LA", customers.get(1279).getState());
	}

	@Test
	@DisplayName("Record 1280: ZIP is 70380")
	void ZIPOfRecord1280() {
		assertEquals("70380", customers.get(1279).getZIP());
	}

	@Test
	@DisplayName("Record 1280: Phone is 985-395-8559")
	void PhoneOfRecord1280() {
		assertEquals("985-395-8559", customers.get(1279).getPhone());
	}

	@Test
	@DisplayName("Record 1280: Fax is 985-395-6124")
	void FaxOfRecord1280() {
		assertEquals("985-395-6124", customers.get(1279).getFax());
	}

	@Test
	@DisplayName("Record 1280: Email is bobbie@haymer.com")
	void EmailOfRecord1280() {
		assertEquals("bobbie@haymer.com", customers.get(1279).getEmail());
	}

	@Test
	@DisplayName("Record 1280: Web is http://www.bobbiehaymer.com")
	void WebOfRecord1280() {
		assertEquals("http://www.bobbiehaymer.com", customers.get(1279).getWeb());
	}
}
