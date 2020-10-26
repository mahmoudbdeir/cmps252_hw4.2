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

@Tag("11")
class Record_1673 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1673: FirstName is Nyl")
	void FirstNameOfRecord1673() {
		assertEquals("Nyl", customers.get(1672).getFirstName());
	}

	@Test
	@DisplayName("Record 1673: LastName is Hayth")
	void LastNameOfRecord1673() {
		assertEquals("Hayth", customers.get(1672).getLastName());
	}

	@Test
	@DisplayName("Record 1673: Company is Lanier, Mark W Esq")
	void CompanyOfRecord1673() {
		assertEquals("Lanier, Mark W Esq", customers.get(1672).getCompany());
	}

	@Test
	@DisplayName("Record 1673: Address is 150 John F Kennedy Pky  #-2")
	void AddressOfRecord1673() {
		assertEquals("150 John F Kennedy Pky  #-2", customers.get(1672).getAddress());
	}

	@Test
	@DisplayName("Record 1673: City is Short Hills")
	void CityOfRecord1673() {
		assertEquals("Short Hills", customers.get(1672).getCity());
	}

	@Test
	@DisplayName("Record 1673: County is Essex")
	void CountyOfRecord1673() {
		assertEquals("Essex", customers.get(1672).getCounty());
	}

	@Test
	@DisplayName("Record 1673: State is NJ")
	void StateOfRecord1673() {
		assertEquals("NJ", customers.get(1672).getState());
	}

	@Test
	@DisplayName("Record 1673: ZIP is 7078")
	void ZIPOfRecord1673() {
		assertEquals("7078", customers.get(1672).getZIP());
	}

	@Test
	@DisplayName("Record 1673: Phone is 973-467-7810")
	void PhoneOfRecord1673() {
		assertEquals("973-467-7810", customers.get(1672).getPhone());
	}

	@Test
	@DisplayName("Record 1673: Fax is 973-467-5977")
	void FaxOfRecord1673() {
		assertEquals("973-467-5977", customers.get(1672).getFax());
	}

	@Test
	@DisplayName("Record 1673: Email is nyl@hayth.com")
	void EmailOfRecord1673() {
		assertEquals("nyl@hayth.com", customers.get(1672).getEmail());
	}

	@Test
	@DisplayName("Record 1673: Web is http://www.nylhayth.com")
	void WebOfRecord1673() {
		assertEquals("http://www.nylhayth.com", customers.get(1672).getWeb());
	}
}
