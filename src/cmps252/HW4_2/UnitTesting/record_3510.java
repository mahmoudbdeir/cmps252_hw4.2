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

@Tag("17")
class Record_3510 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3510: FirstName is Lucretia")
	void FirstNameOfRecord3510() {
		assertEquals("Lucretia", customers.get(3509).getFirstName());
	}

	@Test
	@DisplayName("Record 3510: LastName is Wimbs")
	void LastNameOfRecord3510() {
		assertEquals("Wimbs", customers.get(3509).getLastName());
	}

	@Test
	@DisplayName("Record 3510: Company is Data Systems Group")
	void CompanyOfRecord3510() {
		assertEquals("Data Systems Group", customers.get(3509).getCompany());
	}

	@Test
	@DisplayName("Record 3510: Address is 10817 Yare Cir")
	void AddressOfRecord3510() {
		assertEquals("10817 Yare Cir", customers.get(3509).getAddress());
	}

	@Test
	@DisplayName("Record 3510: City is Canal Fulton")
	void CityOfRecord3510() {
		assertEquals("Canal Fulton", customers.get(3509).getCity());
	}

	@Test
	@DisplayName("Record 3510: County is Stark")
	void CountyOfRecord3510() {
		assertEquals("Stark", customers.get(3509).getCounty());
	}

	@Test
	@DisplayName("Record 3510: State is OH")
	void StateOfRecord3510() {
		assertEquals("OH", customers.get(3509).getState());
	}

	@Test
	@DisplayName("Record 3510: ZIP is 44614")
	void ZIPOfRecord3510() {
		assertEquals("44614", customers.get(3509).getZIP());
	}

	@Test
	@DisplayName("Record 3510: Phone is 330-854-3623")
	void PhoneOfRecord3510() {
		assertEquals("330-854-3623", customers.get(3509).getPhone());
	}

	@Test
	@DisplayName("Record 3510: Fax is 330-854-1644")
	void FaxOfRecord3510() {
		assertEquals("330-854-1644", customers.get(3509).getFax());
	}

	@Test
	@DisplayName("Record 3510: Email is lucretia@wimbs.com")
	void EmailOfRecord3510() {
		assertEquals("lucretia@wimbs.com", customers.get(3509).getEmail());
	}

	@Test
	@DisplayName("Record 3510: Web is http://www.lucretiawimbs.com")
	void WebOfRecord3510() {
		assertEquals("http://www.lucretiawimbs.com", customers.get(3509).getWeb());
	}
}
