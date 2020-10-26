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

@Tag("8")
class Record_3626 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3626: FirstName is Cary")
	void FirstNameOfRecord3626() {
		assertEquals("Cary", customers.get(3625).getFirstName());
	}

	@Test
	@DisplayName("Record 3626: LastName is Ahyet")
	void LastNameOfRecord3626() {
		assertEquals("Ahyet", customers.get(3625).getLastName());
	}

	@Test
	@DisplayName("Record 3626: Company is Heller, Mervin A Jr")
	void CompanyOfRecord3626() {
		assertEquals("Heller, Mervin A Jr", customers.get(3625).getCompany());
	}

	@Test
	@DisplayName("Record 3626: Address is 50 Congress St")
	void AddressOfRecord3626() {
		assertEquals("50 Congress St", customers.get(3625).getAddress());
	}

	@Test
	@DisplayName("Record 3626: City is Boston")
	void CityOfRecord3626() {
		assertEquals("Boston", customers.get(3625).getCity());
	}

	@Test
	@DisplayName("Record 3626: County is Suffolk")
	void CountyOfRecord3626() {
		assertEquals("Suffolk", customers.get(3625).getCounty());
	}

	@Test
	@DisplayName("Record 3626: State is MA")
	void StateOfRecord3626() {
		assertEquals("MA", customers.get(3625).getState());
	}

	@Test
	@DisplayName("Record 3626: ZIP is 2109")
	void ZIPOfRecord3626() {
		assertEquals("2109", customers.get(3625).getZIP());
	}

	@Test
	@DisplayName("Record 3626: Phone is 617-523-5899")
	void PhoneOfRecord3626() {
		assertEquals("617-523-5899", customers.get(3625).getPhone());
	}

	@Test
	@DisplayName("Record 3626: Fax is 617-523-0794")
	void FaxOfRecord3626() {
		assertEquals("617-523-0794", customers.get(3625).getFax());
	}

	@Test
	@DisplayName("Record 3626: Email is cary@ahyet.com")
	void EmailOfRecord3626() {
		assertEquals("cary@ahyet.com", customers.get(3625).getEmail());
	}

	@Test
	@DisplayName("Record 3626: Web is http://www.caryahyet.com")
	void WebOfRecord3626() {
		assertEquals("http://www.caryahyet.com", customers.get(3625).getWeb());
	}
}
