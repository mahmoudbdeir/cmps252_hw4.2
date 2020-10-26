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

@Tag("5")
class Record_2855 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2855: FirstName is Rueben")
	void FirstNameOfRecord2855() {
		assertEquals("Rueben", customers.get(2854).getFirstName());
	}

	@Test
	@DisplayName("Record 2855: LastName is Gunsolus")
	void LastNameOfRecord2855() {
		assertEquals("Gunsolus", customers.get(2854).getLastName());
	}

	@Test
	@DisplayName("Record 2855: Company is Thorstenson, Paul J")
	void CompanyOfRecord2855() {
		assertEquals("Thorstenson, Paul J", customers.get(2854).getCompany());
	}

	@Test
	@DisplayName("Record 2855: Address is 1922 Republic Ave")
	void AddressOfRecord2855() {
		assertEquals("1922 Republic Ave", customers.get(2854).getAddress());
	}

	@Test
	@DisplayName("Record 2855: City is San Leandro")
	void CityOfRecord2855() {
		assertEquals("San Leandro", customers.get(2854).getCity());
	}

	@Test
	@DisplayName("Record 2855: County is Alameda")
	void CountyOfRecord2855() {
		assertEquals("Alameda", customers.get(2854).getCounty());
	}

	@Test
	@DisplayName("Record 2855: State is CA")
	void StateOfRecord2855() {
		assertEquals("CA", customers.get(2854).getState());
	}

	@Test
	@DisplayName("Record 2855: ZIP is 94577")
	void ZIPOfRecord2855() {
		assertEquals("94577", customers.get(2854).getZIP());
	}

	@Test
	@DisplayName("Record 2855: Phone is 510-483-2260")
	void PhoneOfRecord2855() {
		assertEquals("510-483-2260", customers.get(2854).getPhone());
	}

	@Test
	@DisplayName("Record 2855: Fax is 510-483-4785")
	void FaxOfRecord2855() {
		assertEquals("510-483-4785", customers.get(2854).getFax());
	}

	@Test
	@DisplayName("Record 2855: Email is rueben@gunsolus.com")
	void EmailOfRecord2855() {
		assertEquals("rueben@gunsolus.com", customers.get(2854).getEmail());
	}

	@Test
	@DisplayName("Record 2855: Web is http://www.ruebengunsolus.com")
	void WebOfRecord2855() {
		assertEquals("http://www.ruebengunsolus.com", customers.get(2854).getWeb());
	}
}
