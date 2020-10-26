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

@Tag("23")
class Record_1000 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1000: FirstName is Horacio")
	void FirstNameOfRecord1000() {
		assertEquals("Horacio", customers.get(999).getFirstName());
	}

	@Test
	@DisplayName("Record 1000: LastName is Memo")
	void LastNameOfRecord1000() {
		assertEquals("Memo", customers.get(999).getLastName());
	}

	@Test
	@DisplayName("Record 1000: Company is Los Angeles Police Credit Un")
	void CompanyOfRecord1000() {
		assertEquals("Los Angeles Police Credit Un", customers.get(999).getCompany());
	}

	@Test
	@DisplayName("Record 1000: Address is 1667 K St Nw")
	void AddressOfRecord1000() {
		assertEquals("1667 K St Nw", customers.get(999).getAddress());
	}

	@Test
	@DisplayName("Record 1000: City is Washington")
	void CityOfRecord1000() {
		assertEquals("Washington", customers.get(999).getCity());
	}

	@Test
	@DisplayName("Record 1000: County is District of Columbia")
	void CountyOfRecord1000() {
		assertEquals("District of Columbia", customers.get(999).getCounty());
	}

	@Test
	@DisplayName("Record 1000: State is DC")
	void StateOfRecord1000() {
		assertEquals("DC", customers.get(999).getState());
	}

	@Test
	@DisplayName("Record 1000: ZIP is 20006")
	void ZIPOfRecord1000() {
		assertEquals("20006", customers.get(999).getZIP());
	}

	@Test
	@DisplayName("Record 1000: Phone is 202-785-3579")
	void PhoneOfRecord1000() {
		assertEquals("202-785-3579", customers.get(999).getPhone());
	}

	@Test
	@DisplayName("Record 1000: Fax is 202-785-1116")
	void FaxOfRecord1000() {
		assertEquals("202-785-1116", customers.get(999).getFax());
	}

	@Test
	@DisplayName("Record 1000: Email is horacio@memo.com")
	void EmailOfRecord1000() {
		assertEquals("horacio@memo.com", customers.get(999).getEmail());
	}

	@Test
	@DisplayName("Record 1000: Web is http://www.horaciomemo.com")
	void WebOfRecord1000() {
		assertEquals("http://www.horaciomemo.com", customers.get(999).getWeb());
	}
}
