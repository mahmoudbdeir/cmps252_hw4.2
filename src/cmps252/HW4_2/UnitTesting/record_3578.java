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

@Tag("38")
class Record_3578 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3578: FirstName is Lindsay")
	void FirstNameOfRecord3578() {
		assertEquals("Lindsay", customers.get(3577).getFirstName());
	}

	@Test
	@DisplayName("Record 3578: LastName is Zeherquist")
	void LastNameOfRecord3578() {
		assertEquals("Zeherquist", customers.get(3577).getLastName());
	}

	@Test
	@DisplayName("Record 3578: Company is Rope Master Skookum")
	void CompanyOfRecord3578() {
		assertEquals("Rope Master Skookum", customers.get(3577).getCompany());
	}

	@Test
	@DisplayName("Record 3578: Address is 2205 Abbott Rd")
	void AddressOfRecord3578() {
		assertEquals("2205 Abbott Rd", customers.get(3577).getAddress());
	}

	@Test
	@DisplayName("Record 3578: City is East Lansing")
	void CityOfRecord3578() {
		assertEquals("East Lansing", customers.get(3577).getCity());
	}

	@Test
	@DisplayName("Record 3578: County is Ingham")
	void CountyOfRecord3578() {
		assertEquals("Ingham", customers.get(3577).getCounty());
	}

	@Test
	@DisplayName("Record 3578: State is MI")
	void StateOfRecord3578() {
		assertEquals("MI", customers.get(3577).getState());
	}

	@Test
	@DisplayName("Record 3578: ZIP is 48823")
	void ZIPOfRecord3578() {
		assertEquals("48823", customers.get(3577).getZIP());
	}

	@Test
	@DisplayName("Record 3578: Phone is 517-351-1474")
	void PhoneOfRecord3578() {
		assertEquals("517-351-1474", customers.get(3577).getPhone());
	}

	@Test
	@DisplayName("Record 3578: Fax is 517-351-8949")
	void FaxOfRecord3578() {
		assertEquals("517-351-8949", customers.get(3577).getFax());
	}

	@Test
	@DisplayName("Record 3578: Email is lindsay@zeherquist.com")
	void EmailOfRecord3578() {
		assertEquals("lindsay@zeherquist.com", customers.get(3577).getEmail());
	}

	@Test
	@DisplayName("Record 3578: Web is http://www.lindsayzeherquist.com")
	void WebOfRecord3578() {
		assertEquals("http://www.lindsayzeherquist.com", customers.get(3577).getWeb());
	}
}
