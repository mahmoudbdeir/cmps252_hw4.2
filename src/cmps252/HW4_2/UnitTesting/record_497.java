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

@Tag("29")
class Record_497 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 497: FirstName is Jere")
	void FirstNameOfRecord497() {
		assertEquals("Jere", customers.get(496).getFirstName());
	}

	@Test
	@DisplayName("Record 497: LastName is Lamarche")
	void LastNameOfRecord497() {
		assertEquals("Lamarche", customers.get(496).getLastName());
	}

	@Test
	@DisplayName("Record 497: Company is Medford Daily Mercury")
	void CompanyOfRecord497() {
		assertEquals("Medford Daily Mercury", customers.get(496).getCompany());
	}

	@Test
	@DisplayName("Record 497: Address is 8653 Jefferson Hwy")
	void AddressOfRecord497() {
		assertEquals("8653 Jefferson Hwy", customers.get(496).getAddress());
	}

	@Test
	@DisplayName("Record 497: City is Osseo")
	void CityOfRecord497() {
		assertEquals("Osseo", customers.get(496).getCity());
	}

	@Test
	@DisplayName("Record 497: County is Hennepin")
	void CountyOfRecord497() {
		assertEquals("Hennepin", customers.get(496).getCounty());
	}

	@Test
	@DisplayName("Record 497: State is MN")
	void StateOfRecord497() {
		assertEquals("MN", customers.get(496).getState());
	}

	@Test
	@DisplayName("Record 497: ZIP is 55369")
	void ZIPOfRecord497() {
		assertEquals("55369", customers.get(496).getZIP());
	}

	@Test
	@DisplayName("Record 497: Phone is 763-424-7807")
	void PhoneOfRecord497() {
		assertEquals("763-424-7807", customers.get(496).getPhone());
	}

	@Test
	@DisplayName("Record 497: Fax is 763-424-1757")
	void FaxOfRecord497() {
		assertEquals("763-424-1757", customers.get(496).getFax());
	}

	@Test
	@DisplayName("Record 497: Email is jere@lamarche.com")
	void EmailOfRecord497() {
		assertEquals("jere@lamarche.com", customers.get(496).getEmail());
	}

	@Test
	@DisplayName("Record 497: Web is http://www.jerelamarche.com")
	void WebOfRecord497() {
		assertEquals("http://www.jerelamarche.com", customers.get(496).getWeb());
	}
}
