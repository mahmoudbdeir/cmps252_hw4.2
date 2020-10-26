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

@Tag("25")
class Record_2175 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2175: FirstName is Noelle")
	void FirstNameOfRecord2175() {
		assertEquals("Noelle", customers.get(2174).getFirstName());
	}

	@Test
	@DisplayName("Record 2175: LastName is Kramarczyk")
	void LastNameOfRecord2175() {
		assertEquals("Kramarczyk", customers.get(2174).getLastName());
	}

	@Test
	@DisplayName("Record 2175: Company is Tollison, Grady F Iii")
	void CompanyOfRecord2175() {
		assertEquals("Tollison, Grady F Iii", customers.get(2174).getCompany());
	}

	@Test
	@DisplayName("Record 2175: Address is 55 Park Stre")
	void AddressOfRecord2175() {
		assertEquals("55 Park Stre", customers.get(2174).getAddress());
	}

	@Test
	@DisplayName("Record 2175: City is Little River")
	void CityOfRecord2175() {
		assertEquals("Little River", customers.get(2174).getCity());
	}

	@Test
	@DisplayName("Record 2175: County is Horry")
	void CountyOfRecord2175() {
		assertEquals("Horry", customers.get(2174).getCounty());
	}

	@Test
	@DisplayName("Record 2175: State is SC")
	void StateOfRecord2175() {
		assertEquals("SC", customers.get(2174).getState());
	}

	@Test
	@DisplayName("Record 2175: ZIP is 29566")
	void ZIPOfRecord2175() {
		assertEquals("29566", customers.get(2174).getZIP());
	}

	@Test
	@DisplayName("Record 2175: Phone is 843-249-1843")
	void PhoneOfRecord2175() {
		assertEquals("843-249-1843", customers.get(2174).getPhone());
	}

	@Test
	@DisplayName("Record 2175: Fax is 843-249-2619")
	void FaxOfRecord2175() {
		assertEquals("843-249-2619", customers.get(2174).getFax());
	}

	@Test
	@DisplayName("Record 2175: Email is noelle@kramarczyk.com")
	void EmailOfRecord2175() {
		assertEquals("noelle@kramarczyk.com", customers.get(2174).getEmail());
	}

	@Test
	@DisplayName("Record 2175: Web is http://www.noellekramarczyk.com")
	void WebOfRecord2175() {
		assertEquals("http://www.noellekramarczyk.com", customers.get(2174).getWeb());
	}
}
