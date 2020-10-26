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

@Tag("32")
class Record_2155 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2155: FirstName is Lowell")
	void FirstNameOfRecord2155() {
		assertEquals("Lowell", customers.get(2154).getFirstName());
	}

	@Test
	@DisplayName("Record 2155: LastName is Stadtler")
	void LastNameOfRecord2155() {
		assertEquals("Stadtler", customers.get(2154).getLastName());
	}

	@Test
	@DisplayName("Record 2155: Company is General Mdse Distritutors Cncl")
	void CompanyOfRecord2155() {
		assertEquals("General Mdse Distritutors Cncl", customers.get(2154).getCompany());
	}

	@Test
	@DisplayName("Record 2155: Address is 518 S Fair Oaks Ave")
	void AddressOfRecord2155() {
		assertEquals("518 S Fair Oaks Ave", customers.get(2154).getAddress());
	}

	@Test
	@DisplayName("Record 2155: City is Pasadena")
	void CityOfRecord2155() {
		assertEquals("Pasadena", customers.get(2154).getCity());
	}

	@Test
	@DisplayName("Record 2155: County is Los Angeles")
	void CountyOfRecord2155() {
		assertEquals("Los Angeles", customers.get(2154).getCounty());
	}

	@Test
	@DisplayName("Record 2155: State is CA")
	void StateOfRecord2155() {
		assertEquals("CA", customers.get(2154).getState());
	}

	@Test
	@DisplayName("Record 2155: ZIP is 91105")
	void ZIPOfRecord2155() {
		assertEquals("91105", customers.get(2154).getZIP());
	}

	@Test
	@DisplayName("Record 2155: Phone is 626-449-4267")
	void PhoneOfRecord2155() {
		assertEquals("626-449-4267", customers.get(2154).getPhone());
	}

	@Test
	@DisplayName("Record 2155: Fax is 626-449-2627")
	void FaxOfRecord2155() {
		assertEquals("626-449-2627", customers.get(2154).getFax());
	}

	@Test
	@DisplayName("Record 2155: Email is lowell@stadtler.com")
	void EmailOfRecord2155() {
		assertEquals("lowell@stadtler.com", customers.get(2154).getEmail());
	}

	@Test
	@DisplayName("Record 2155: Web is http://www.lowellstadtler.com")
	void WebOfRecord2155() {
		assertEquals("http://www.lowellstadtler.com", customers.get(2154).getWeb());
	}
}
