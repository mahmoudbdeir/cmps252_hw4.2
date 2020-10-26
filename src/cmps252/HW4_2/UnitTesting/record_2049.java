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

@Tag("31")
class Record_2049 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2049: FirstName is Raymundo")
	void FirstNameOfRecord2049() {
		assertEquals("Raymundo", customers.get(2048).getFirstName());
	}

	@Test
	@DisplayName("Record 2049: LastName is Mincy")
	void LastNameOfRecord2049() {
		assertEquals("Mincy", customers.get(2048).getLastName());
	}

	@Test
	@DisplayName("Record 2049: Company is Jorgensen & Associates")
	void CompanyOfRecord2049() {
		assertEquals("Jorgensen & Associates", customers.get(2048).getCompany());
	}

	@Test
	@DisplayName("Record 2049: Address is 1704 S Liberty Ave")
	void AddressOfRecord2049() {
		assertEquals("1704 S Liberty Ave", customers.get(2048).getAddress());
	}

	@Test
	@DisplayName("Record 2049: City is Alliance")
	void CityOfRecord2049() {
		assertEquals("Alliance", customers.get(2048).getCity());
	}

	@Test
	@DisplayName("Record 2049: County is Stark")
	void CountyOfRecord2049() {
		assertEquals("Stark", customers.get(2048).getCounty());
	}

	@Test
	@DisplayName("Record 2049: State is OH")
	void StateOfRecord2049() {
		assertEquals("OH", customers.get(2048).getState());
	}

	@Test
	@DisplayName("Record 2049: ZIP is 44601")
	void ZIPOfRecord2049() {
		assertEquals("44601", customers.get(2048).getZIP());
	}

	@Test
	@DisplayName("Record 2049: Phone is 330-823-5994")
	void PhoneOfRecord2049() {
		assertEquals("330-823-5994", customers.get(2048).getPhone());
	}

	@Test
	@DisplayName("Record 2049: Fax is 330-823-3454")
	void FaxOfRecord2049() {
		assertEquals("330-823-3454", customers.get(2048).getFax());
	}

	@Test
	@DisplayName("Record 2049: Email is raymundo@mincy.com")
	void EmailOfRecord2049() {
		assertEquals("raymundo@mincy.com", customers.get(2048).getEmail());
	}

	@Test
	@DisplayName("Record 2049: Web is http://www.raymundomincy.com")
	void WebOfRecord2049() {
		assertEquals("http://www.raymundomincy.com", customers.get(2048).getWeb());
	}
}
