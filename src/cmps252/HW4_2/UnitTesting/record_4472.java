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

@Tag("21")
class Record_4472 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4472: FirstName is Gus")
	void FirstNameOfRecord4472() {
		assertEquals("Gus", customers.get(4471).getFirstName());
	}

	@Test
	@DisplayName("Record 4472: LastName is Lakey")
	void LastNameOfRecord4472() {
		assertEquals("Lakey", customers.get(4471).getLastName());
	}

	@Test
	@DisplayName("Record 4472: Company is Cowa Co")
	void CompanyOfRecord4472() {
		assertEquals("Cowa Co", customers.get(4471).getCompany());
	}

	@Test
	@DisplayName("Record 4472: Address is 148 S State St")
	void AddressOfRecord4472() {
		assertEquals("148 S State St", customers.get(4471).getAddress());
	}

	@Test
	@DisplayName("Record 4472: City is Orem")
	void CityOfRecord4472() {
		assertEquals("Orem", customers.get(4471).getCity());
	}

	@Test
	@DisplayName("Record 4472: County is Utah")
	void CountyOfRecord4472() {
		assertEquals("Utah", customers.get(4471).getCounty());
	}

	@Test
	@DisplayName("Record 4472: State is UT")
	void StateOfRecord4472() {
		assertEquals("UT", customers.get(4471).getState());
	}

	@Test
	@DisplayName("Record 4472: ZIP is 84058")
	void ZIPOfRecord4472() {
		assertEquals("84058", customers.get(4471).getZIP());
	}

	@Test
	@DisplayName("Record 4472: Phone is 801-221-6016")
	void PhoneOfRecord4472() {
		assertEquals("801-221-6016", customers.get(4471).getPhone());
	}

	@Test
	@DisplayName("Record 4472: Fax is 801-221-3245")
	void FaxOfRecord4472() {
		assertEquals("801-221-3245", customers.get(4471).getFax());
	}

	@Test
	@DisplayName("Record 4472: Email is gus@lakey.com")
	void EmailOfRecord4472() {
		assertEquals("gus@lakey.com", customers.get(4471).getEmail());
	}

	@Test
	@DisplayName("Record 4472: Web is http://www.guslakey.com")
	void WebOfRecord4472() {
		assertEquals("http://www.guslakey.com", customers.get(4471).getWeb());
	}
}
