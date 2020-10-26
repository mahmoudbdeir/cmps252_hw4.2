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

@Tag("3")
class Record_4980 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4980: FirstName is Reed")
	void FirstNameOfRecord4980() {
		assertEquals("Reed", customers.get(4979).getFirstName());
	}

	@Test
	@DisplayName("Record 4980: LastName is Wangler")
	void LastNameOfRecord4980() {
		assertEquals("Wangler", customers.get(4979).getLastName());
	}

	@Test
	@DisplayName("Record 4980: Company is Dobosz, Michael D Esq")
	void CompanyOfRecord4980() {
		assertEquals("Dobosz, Michael D Esq", customers.get(4979).getCompany());
	}

	@Test
	@DisplayName("Record 4980: Address is 104 S Glover  #-204")
	void AddressOfRecord4980() {
		assertEquals("104 S Glover  #-204", customers.get(4979).getAddress());
	}

	@Test
	@DisplayName("Record 4980: City is Twisp")
	void CityOfRecord4980() {
		assertEquals("Twisp", customers.get(4979).getCity());
	}

	@Test
	@DisplayName("Record 4980: County is Okanogan")
	void CountyOfRecord4980() {
		assertEquals("Okanogan", customers.get(4979).getCounty());
	}

	@Test
	@DisplayName("Record 4980: State is WA")
	void StateOfRecord4980() {
		assertEquals("WA", customers.get(4979).getState());
	}

	@Test
	@DisplayName("Record 4980: ZIP is 98856")
	void ZIPOfRecord4980() {
		assertEquals("98856", customers.get(4979).getZIP());
	}

	@Test
	@DisplayName("Record 4980: Phone is 509-997-6307")
	void PhoneOfRecord4980() {
		assertEquals("509-997-6307", customers.get(4979).getPhone());
	}

	@Test
	@DisplayName("Record 4980: Fax is 509-997-5576")
	void FaxOfRecord4980() {
		assertEquals("509-997-5576", customers.get(4979).getFax());
	}

	@Test
	@DisplayName("Record 4980: Email is reed@wangler.com")
	void EmailOfRecord4980() {
		assertEquals("reed@wangler.com", customers.get(4979).getEmail());
	}

	@Test
	@DisplayName("Record 4980: Web is http://www.reedwangler.com")
	void WebOfRecord4980() {
		assertEquals("http://www.reedwangler.com", customers.get(4979).getWeb());
	}
}
