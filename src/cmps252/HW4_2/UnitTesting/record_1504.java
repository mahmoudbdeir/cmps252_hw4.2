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

@Tag("1")
class Record_1504 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1504: FirstName is Dwight")
	void FirstNameOfRecord1504() {
		assertEquals("Dwight", customers.get(1503).getFirstName());
	}

	@Test
	@DisplayName("Record 1504: LastName is Popp")
	void LastNameOfRecord1504() {
		assertEquals("Popp", customers.get(1503).getLastName());
	}

	@Test
	@DisplayName("Record 1504: Company is Jencks, Michael R Esq")
	void CompanyOfRecord1504() {
		assertEquals("Jencks, Michael R Esq", customers.get(1503).getCompany());
	}

	@Test
	@DisplayName("Record 1504: Address is 5590 Lauby Rd")
	void AddressOfRecord1504() {
		assertEquals("5590 Lauby Rd", customers.get(1503).getAddress());
	}

	@Test
	@DisplayName("Record 1504: City is Canton")
	void CityOfRecord1504() {
		assertEquals("Canton", customers.get(1503).getCity());
	}

	@Test
	@DisplayName("Record 1504: County is Stark")
	void CountyOfRecord1504() {
		assertEquals("Stark", customers.get(1503).getCounty());
	}

	@Test
	@DisplayName("Record 1504: State is OH")
	void StateOfRecord1504() {
		assertEquals("OH", customers.get(1503).getState());
	}

	@Test
	@DisplayName("Record 1504: ZIP is 44720")
	void ZIPOfRecord1504() {
		assertEquals("44720", customers.get(1503).getZIP());
	}

	@Test
	@DisplayName("Record 1504: Phone is 330-494-3317")
	void PhoneOfRecord1504() {
		assertEquals("330-494-3317", customers.get(1503).getPhone());
	}

	@Test
	@DisplayName("Record 1504: Fax is 330-494-9693")
	void FaxOfRecord1504() {
		assertEquals("330-494-9693", customers.get(1503).getFax());
	}

	@Test
	@DisplayName("Record 1504: Email is dwight@popp.com")
	void EmailOfRecord1504() {
		assertEquals("dwight@popp.com", customers.get(1503).getEmail());
	}

	@Test
	@DisplayName("Record 1504: Web is http://www.dwightpopp.com")
	void WebOfRecord1504() {
		assertEquals("http://www.dwightpopp.com", customers.get(1503).getWeb());
	}
}
