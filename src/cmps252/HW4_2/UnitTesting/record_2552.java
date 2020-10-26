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

@Tag("47")
class Record_2552 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2552: FirstName is Arnoldo")
	void FirstNameOfRecord2552() {
		assertEquals("Arnoldo", customers.get(2551).getFirstName());
	}

	@Test
	@DisplayName("Record 2552: LastName is Harkleroad")
	void LastNameOfRecord2552() {
		assertEquals("Harkleroad", customers.get(2551).getLastName());
	}

	@Test
	@DisplayName("Record 2552: Company is Jec Tv")
	void CompanyOfRecord2552() {
		assertEquals("Jec Tv", customers.get(2551).getCompany());
	}

	@Test
	@DisplayName("Record 2552: Address is 2560 Junction Ave")
	void AddressOfRecord2552() {
		assertEquals("2560 Junction Ave", customers.get(2551).getAddress());
	}

	@Test
	@DisplayName("Record 2552: City is San Jose")
	void CityOfRecord2552() {
		assertEquals("San Jose", customers.get(2551).getCity());
	}

	@Test
	@DisplayName("Record 2552: County is Santa Clara")
	void CountyOfRecord2552() {
		assertEquals("Santa Clara", customers.get(2551).getCounty());
	}

	@Test
	@DisplayName("Record 2552: State is CA")
	void StateOfRecord2552() {
		assertEquals("CA", customers.get(2551).getState());
	}

	@Test
	@DisplayName("Record 2552: ZIP is 95134")
	void ZIPOfRecord2552() {
		assertEquals("95134", customers.get(2551).getZIP());
	}

	@Test
	@DisplayName("Record 2552: Phone is 408-954-5330")
	void PhoneOfRecord2552() {
		assertEquals("408-954-5330", customers.get(2551).getPhone());
	}

	@Test
	@DisplayName("Record 2552: Fax is 408-954-9082")
	void FaxOfRecord2552() {
		assertEquals("408-954-9082", customers.get(2551).getFax());
	}

	@Test
	@DisplayName("Record 2552: Email is arnoldo@harkleroad.com")
	void EmailOfRecord2552() {
		assertEquals("arnoldo@harkleroad.com", customers.get(2551).getEmail());
	}

	@Test
	@DisplayName("Record 2552: Web is http://www.arnoldoharkleroad.com")
	void WebOfRecord2552() {
		assertEquals("http://www.arnoldoharkleroad.com", customers.get(2551).getWeb());
	}
}
