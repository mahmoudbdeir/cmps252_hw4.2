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

@Tag("28")
class Record_4580 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4580: FirstName is Mina")
	void FirstNameOfRecord4580() {
		assertEquals("Mina", customers.get(4579).getFirstName());
	}

	@Test
	@DisplayName("Record 4580: LastName is Jarred")
	void LastNameOfRecord4580() {
		assertEquals("Jarred", customers.get(4579).getLastName());
	}

	@Test
	@DisplayName("Record 4580: Company is Edwards Onyll Olds Cad Subaru")
	void CompanyOfRecord4580() {
		assertEquals("Edwards Onyll Olds Cad Subaru", customers.get(4579).getCompany());
	}

	@Test
	@DisplayName("Record 4580: Address is 80 Tillman St")
	void AddressOfRecord4580() {
		assertEquals("80 Tillman St", customers.get(4579).getAddress());
	}

	@Test
	@DisplayName("Record 4580: City is Westwood")
	void CityOfRecord4580() {
		assertEquals("Westwood", customers.get(4579).getCity());
	}

	@Test
	@DisplayName("Record 4580: County is Bergen")
	void CountyOfRecord4580() {
		assertEquals("Bergen", customers.get(4579).getCounty());
	}

	@Test
	@DisplayName("Record 4580: State is NJ")
	void StateOfRecord4580() {
		assertEquals("NJ", customers.get(4579).getState());
	}

	@Test
	@DisplayName("Record 4580: ZIP is 7675")
	void ZIPOfRecord4580() {
		assertEquals("7675", customers.get(4579).getZIP());
	}

	@Test
	@DisplayName("Record 4580: Phone is 201-666-7353")
	void PhoneOfRecord4580() {
		assertEquals("201-666-7353", customers.get(4579).getPhone());
	}

	@Test
	@DisplayName("Record 4580: Fax is 201-666-9533")
	void FaxOfRecord4580() {
		assertEquals("201-666-9533", customers.get(4579).getFax());
	}

	@Test
	@DisplayName("Record 4580: Email is mina@jarred.com")
	void EmailOfRecord4580() {
		assertEquals("mina@jarred.com", customers.get(4579).getEmail());
	}

	@Test
	@DisplayName("Record 4580: Web is http://www.minajarred.com")
	void WebOfRecord4580() {
		assertEquals("http://www.minajarred.com", customers.get(4579).getWeb());
	}
}
