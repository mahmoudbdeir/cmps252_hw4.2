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

@Tag("24")
class Record_4938 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4938: FirstName is Elisha")
	void FirstNameOfRecord4938() {
		assertEquals("Elisha", customers.get(4937).getFirstName());
	}

	@Test
	@DisplayName("Record 4938: LastName is Aubry")
	void LastNameOfRecord4938() {
		assertEquals("Aubry", customers.get(4937).getLastName());
	}

	@Test
	@DisplayName("Record 4938: Company is Deluxe Die Mold Company")
	void CompanyOfRecord4938() {
		assertEquals("Deluxe Die Mold Company", customers.get(4937).getCompany());
	}

	@Test
	@DisplayName("Record 4938: Address is 13131 Turks Head Pl")
	void AddressOfRecord4938() {
		assertEquals("13131 Turks Head Pl", customers.get(4937).getAddress());
	}

	@Test
	@DisplayName("Record 4938: City is Providence")
	void CityOfRecord4938() {
		assertEquals("Providence", customers.get(4937).getCity());
	}

	@Test
	@DisplayName("Record 4938: County is Providence")
	void CountyOfRecord4938() {
		assertEquals("Providence", customers.get(4937).getCounty());
	}

	@Test
	@DisplayName("Record 4938: State is RI")
	void StateOfRecord4938() {
		assertEquals("RI", customers.get(4937).getState());
	}

	@Test
	@DisplayName("Record 4938: ZIP is 02903")
	void ZIPOfRecord4938() {
		assertEquals("02903", customers.get(4937).getZIP());
	}

	@Test
	@DisplayName("Record 4938: Phone is 401-274-1824")
	void PhoneOfRecord4938() {
		assertEquals("401-274-1824", customers.get(4937).getPhone());
	}

	@Test
	@DisplayName("Record 4938: Fax is 401-274-6065")
	void FaxOfRecord4938() {
		assertEquals("401-274-6065", customers.get(4937).getFax());
	}

	@Test
	@DisplayName("Record 4938: Email is elisha@aubry.com")
	void EmailOfRecord4938() {
		assertEquals("elisha@aubry.com", customers.get(4937).getEmail());
	}

	@Test
	@DisplayName("Record 4938: Web is http://www.elishaaubry.com")
	void WebOfRecord4938() {
		assertEquals("http://www.elishaaubry.com", customers.get(4937).getWeb());
	}
}
