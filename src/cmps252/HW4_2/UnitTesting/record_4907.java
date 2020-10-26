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

@Tag("18")
class Record_4907 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4907: FirstName is Julian")
	void FirstNameOfRecord4907() {
		assertEquals("Julian", customers.get(4906).getFirstName());
	}

	@Test
	@DisplayName("Record 4907: LastName is Colesar")
	void LastNameOfRecord4907() {
		assertEquals("Colesar", customers.get(4906).getLastName());
	}

	@Test
	@DisplayName("Record 4907: Company is Davis & Davis Associates Pc")
	void CompanyOfRecord4907() {
		assertEquals("Davis & Davis Associates Pc", customers.get(4906).getCompany());
	}

	@Test
	@DisplayName("Record 4907: Address is 390 E 3rd St")
	void AddressOfRecord4907() {
		assertEquals("390 E 3rd St", customers.get(4906).getAddress());
	}

	@Test
	@DisplayName("Record 4907: City is Long Beach")
	void CityOfRecord4907() {
		assertEquals("Long Beach", customers.get(4906).getCity());
	}

	@Test
	@DisplayName("Record 4907: County is Los Angeles")
	void CountyOfRecord4907() {
		assertEquals("Los Angeles", customers.get(4906).getCounty());
	}

	@Test
	@DisplayName("Record 4907: State is CA")
	void StateOfRecord4907() {
		assertEquals("CA", customers.get(4906).getState());
	}

	@Test
	@DisplayName("Record 4907: ZIP is 90802")
	void ZIPOfRecord4907() {
		assertEquals("90802", customers.get(4906).getZIP());
	}

	@Test
	@DisplayName("Record 4907: Phone is 562-495-0521")
	void PhoneOfRecord4907() {
		assertEquals("562-495-0521", customers.get(4906).getPhone());
	}

	@Test
	@DisplayName("Record 4907: Fax is 562-495-1729")
	void FaxOfRecord4907() {
		assertEquals("562-495-1729", customers.get(4906).getFax());
	}

	@Test
	@DisplayName("Record 4907: Email is julian@colesar.com")
	void EmailOfRecord4907() {
		assertEquals("julian@colesar.com", customers.get(4906).getEmail());
	}

	@Test
	@DisplayName("Record 4907: Web is http://www.juliancolesar.com")
	void WebOfRecord4907() {
		assertEquals("http://www.juliancolesar.com", customers.get(4906).getWeb());
	}
}
