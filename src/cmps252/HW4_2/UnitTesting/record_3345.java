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
class Record_3345 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3345: FirstName is Juan")
	void FirstNameOfRecord3345() {
		assertEquals("Juan", customers.get(3344).getFirstName());
	}

	@Test
	@DisplayName("Record 3345: LastName is Beute")
	void LastNameOfRecord3345() {
		assertEquals("Beute", customers.get(3344).getLastName());
	}

	@Test
	@DisplayName("Record 3345: Company is Toms, Robert L Jr")
	void CompanyOfRecord3345() {
		assertEquals("Toms, Robert L Jr", customers.get(3344).getCompany());
	}

	@Test
	@DisplayName("Record 3345: Address is 16133 Ventura Blvd")
	void AddressOfRecord3345() {
		assertEquals("16133 Ventura Blvd", customers.get(3344).getAddress());
	}

	@Test
	@DisplayName("Record 3345: City is Encino")
	void CityOfRecord3345() {
		assertEquals("Encino", customers.get(3344).getCity());
	}

	@Test
	@DisplayName("Record 3345: County is Los Angeles")
	void CountyOfRecord3345() {
		assertEquals("Los Angeles", customers.get(3344).getCounty());
	}

	@Test
	@DisplayName("Record 3345: State is CA")
	void StateOfRecord3345() {
		assertEquals("CA", customers.get(3344).getState());
	}

	@Test
	@DisplayName("Record 3345: ZIP is 91436")
	void ZIPOfRecord3345() {
		assertEquals("91436", customers.get(3344).getZIP());
	}

	@Test
	@DisplayName("Record 3345: Phone is 818-783-0764")
	void PhoneOfRecord3345() {
		assertEquals("818-783-0764", customers.get(3344).getPhone());
	}

	@Test
	@DisplayName("Record 3345: Fax is 818-783-7906")
	void FaxOfRecord3345() {
		assertEquals("818-783-7906", customers.get(3344).getFax());
	}

	@Test
	@DisplayName("Record 3345: Email is juan@beute.com")
	void EmailOfRecord3345() {
		assertEquals("juan@beute.com", customers.get(3344).getEmail());
	}

	@Test
	@DisplayName("Record 3345: Web is http://www.juanbeute.com")
	void WebOfRecord3345() {
		assertEquals("http://www.juanbeute.com", customers.get(3344).getWeb());
	}
}
