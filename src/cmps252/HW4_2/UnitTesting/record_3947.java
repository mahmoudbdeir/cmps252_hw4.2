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
class Record_3947 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3947: FirstName is Delmer")
	void FirstNameOfRecord3947() {
		assertEquals("Delmer", customers.get(3946).getFirstName());
	}

	@Test
	@DisplayName("Record 3947: LastName is Blow")
	void LastNameOfRecord3947() {
		assertEquals("Blow", customers.get(3946).getLastName());
	}

	@Test
	@DisplayName("Record 3947: Company is Ramada Inn")
	void CompanyOfRecord3947() {
		assertEquals("Ramada Inn", customers.get(3946).getCompany());
	}

	@Test
	@DisplayName("Record 3947: Address is 209 E Commerce St")
	void AddressOfRecord3947() {
		assertEquals("209 E Commerce St", customers.get(3946).getAddress());
	}

	@Test
	@DisplayName("Record 3947: City is Aberdeen")
	void CityOfRecord3947() {
		assertEquals("Aberdeen", customers.get(3946).getCity());
	}

	@Test
	@DisplayName("Record 3947: County is Monroe")
	void CountyOfRecord3947() {
		assertEquals("Monroe", customers.get(3946).getCounty());
	}

	@Test
	@DisplayName("Record 3947: State is MS")
	void StateOfRecord3947() {
		assertEquals("MS", customers.get(3946).getState());
	}

	@Test
	@DisplayName("Record 3947: ZIP is 39730")
	void ZIPOfRecord3947() {
		assertEquals("39730", customers.get(3946).getZIP());
	}

	@Test
	@DisplayName("Record 3947: Phone is 662-369-2502")
	void PhoneOfRecord3947() {
		assertEquals("662-369-2502", customers.get(3946).getPhone());
	}

	@Test
	@DisplayName("Record 3947: Fax is 662-369-3482")
	void FaxOfRecord3947() {
		assertEquals("662-369-3482", customers.get(3946).getFax());
	}

	@Test
	@DisplayName("Record 3947: Email is delmer@blow.com")
	void EmailOfRecord3947() {
		assertEquals("delmer@blow.com", customers.get(3946).getEmail());
	}

	@Test
	@DisplayName("Record 3947: Web is http://www.delmerblow.com")
	void WebOfRecord3947() {
		assertEquals("http://www.delmerblow.com", customers.get(3946).getWeb());
	}
}
