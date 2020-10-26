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

@Tag("13")
class Record_1470 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1470: FirstName is Jade")
	void FirstNameOfRecord1470() {
		assertEquals("Jade", customers.get(1469).getFirstName());
	}

	@Test
	@DisplayName("Record 1470: LastName is Goodspeed")
	void LastNameOfRecord1470() {
		assertEquals("Goodspeed", customers.get(1469).getLastName());
	}

	@Test
	@DisplayName("Record 1470: Company is Williams, Ernest B Iv")
	void CompanyOfRecord1470() {
		assertEquals("Williams, Ernest B Iv", customers.get(1469).getCompany());
	}

	@Test
	@DisplayName("Record 1470: Address is 304 N Meridian Ave")
	void AddressOfRecord1470() {
		assertEquals("304 N Meridian Ave", customers.get(1469).getAddress());
	}

	@Test
	@DisplayName("Record 1470: City is Oklahoma City")
	void CityOfRecord1470() {
		assertEquals("Oklahoma City", customers.get(1469).getCity());
	}

	@Test
	@DisplayName("Record 1470: County is Oklahoma")
	void CountyOfRecord1470() {
		assertEquals("Oklahoma", customers.get(1469).getCounty());
	}

	@Test
	@DisplayName("Record 1470: State is OK")
	void StateOfRecord1470() {
		assertEquals("OK", customers.get(1469).getState());
	}

	@Test
	@DisplayName("Record 1470: ZIP is 73107")
	void ZIPOfRecord1470() {
		assertEquals("73107", customers.get(1469).getZIP());
	}

	@Test
	@DisplayName("Record 1470: Phone is 405-946-5985")
	void PhoneOfRecord1470() {
		assertEquals("405-946-5985", customers.get(1469).getPhone());
	}

	@Test
	@DisplayName("Record 1470: Fax is 405-946-7187")
	void FaxOfRecord1470() {
		assertEquals("405-946-7187", customers.get(1469).getFax());
	}

	@Test
	@DisplayName("Record 1470: Email is jade@goodspeed.com")
	void EmailOfRecord1470() {
		assertEquals("jade@goodspeed.com", customers.get(1469).getEmail());
	}

	@Test
	@DisplayName("Record 1470: Web is http://www.jadegoodspeed.com")
	void WebOfRecord1470() {
		assertEquals("http://www.jadegoodspeed.com", customers.get(1469).getWeb());
	}
}
