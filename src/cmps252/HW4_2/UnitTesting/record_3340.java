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
class Record_3340 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3340: FirstName is Emery")
	void FirstNameOfRecord3340() {
		assertEquals("Emery", customers.get(3339).getFirstName());
	}

	@Test
	@DisplayName("Record 3340: LastName is Cozza")
	void LastNameOfRecord3340() {
		assertEquals("Cozza", customers.get(3339).getLastName());
	}

	@Test
	@DisplayName("Record 3340: Company is Broad Street Deli")
	void CompanyOfRecord3340() {
		assertEquals("Broad Street Deli", customers.get(3339).getCompany());
	}

	@Test
	@DisplayName("Record 3340: Address is 16133 Ventura Blvd  #-1080")
	void AddressOfRecord3340() {
		assertEquals("16133 Ventura Blvd  #-1080", customers.get(3339).getAddress());
	}

	@Test
	@DisplayName("Record 3340: City is Encino")
	void CityOfRecord3340() {
		assertEquals("Encino", customers.get(3339).getCity());
	}

	@Test
	@DisplayName("Record 3340: County is Los Angeles")
	void CountyOfRecord3340() {
		assertEquals("Los Angeles", customers.get(3339).getCounty());
	}

	@Test
	@DisplayName("Record 3340: State is CA")
	void StateOfRecord3340() {
		assertEquals("CA", customers.get(3339).getState());
	}

	@Test
	@DisplayName("Record 3340: ZIP is 91436")
	void ZIPOfRecord3340() {
		assertEquals("91436", customers.get(3339).getZIP());
	}

	@Test
	@DisplayName("Record 3340: Phone is 818-783-3173")
	void PhoneOfRecord3340() {
		assertEquals("818-783-3173", customers.get(3339).getPhone());
	}

	@Test
	@DisplayName("Record 3340: Fax is 818-783-4826")
	void FaxOfRecord3340() {
		assertEquals("818-783-4826", customers.get(3339).getFax());
	}

	@Test
	@DisplayName("Record 3340: Email is emery@cozza.com")
	void EmailOfRecord3340() {
		assertEquals("emery@cozza.com", customers.get(3339).getEmail());
	}

	@Test
	@DisplayName("Record 3340: Web is http://www.emerycozza.com")
	void WebOfRecord3340() {
		assertEquals("http://www.emerycozza.com", customers.get(3339).getWeb());
	}
}
