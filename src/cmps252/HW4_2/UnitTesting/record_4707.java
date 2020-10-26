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

@Tag("0")
class Record_4707 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4707: FirstName is Zoila")
	void FirstNameOfRecord4707() {
		assertEquals("Zoila", customers.get(4706).getFirstName());
	}

	@Test
	@DisplayName("Record 4707: LastName is Ryling")
	void LastNameOfRecord4707() {
		assertEquals("Ryling", customers.get(4706).getLastName());
	}

	@Test
	@DisplayName("Record 4707: Company is Josel, John D Esq")
	void CompanyOfRecord4707() {
		assertEquals("Josel, John D Esq", customers.get(4706).getCompany());
	}

	@Test
	@DisplayName("Record 4707: Address is 2400 S 57th St")
	void AddressOfRecord4707() {
		assertEquals("2400 S 57th St", customers.get(4706).getAddress());
	}

	@Test
	@DisplayName("Record 4707: City is Temple")
	void CityOfRecord4707() {
		assertEquals("Temple", customers.get(4706).getCity());
	}

	@Test
	@DisplayName("Record 4707: County is Bell")
	void CountyOfRecord4707() {
		assertEquals("Bell", customers.get(4706).getCounty());
	}

	@Test
	@DisplayName("Record 4707: State is TX")
	void StateOfRecord4707() {
		assertEquals("TX", customers.get(4706).getState());
	}

	@Test
	@DisplayName("Record 4707: ZIP is 76504")
	void ZIPOfRecord4707() {
		assertEquals("76504", customers.get(4706).getZIP());
	}

	@Test
	@DisplayName("Record 4707: Phone is 254-773-8324")
	void PhoneOfRecord4707() {
		assertEquals("254-773-8324", customers.get(4706).getPhone());
	}

	@Test
	@DisplayName("Record 4707: Fax is 254-773-8926")
	void FaxOfRecord4707() {
		assertEquals("254-773-8926", customers.get(4706).getFax());
	}

	@Test
	@DisplayName("Record 4707: Email is zoila@ryling.com")
	void EmailOfRecord4707() {
		assertEquals("zoila@ryling.com", customers.get(4706).getEmail());
	}

	@Test
	@DisplayName("Record 4707: Web is http://www.zoilaryling.com")
	void WebOfRecord4707() {
		assertEquals("http://www.zoilaryling.com", customers.get(4706).getWeb());
	}
}
