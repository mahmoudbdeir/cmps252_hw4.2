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
class Record_2561 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2561: FirstName is Evan")
	void FirstNameOfRecord2561() {
		assertEquals("Evan", customers.get(2560).getFirstName());
	}

	@Test
	@DisplayName("Record 2561: LastName is Nepomuceno")
	void LastNameOfRecord2561() {
		assertEquals("Nepomuceno", customers.get(2560).getLastName());
	}

	@Test
	@DisplayName("Record 2561: Company is Southampton Contractors Inc")
	void CompanyOfRecord2561() {
		assertEquals("Southampton Contractors Inc", customers.get(2560).getCompany());
	}

	@Test
	@DisplayName("Record 2561: Address is 2660 S Division Ave")
	void AddressOfRecord2561() {
		assertEquals("2660 S Division Ave", customers.get(2560).getAddress());
	}

	@Test
	@DisplayName("Record 2561: City is Grand Rapids")
	void CityOfRecord2561() {
		assertEquals("Grand Rapids", customers.get(2560).getCity());
	}

	@Test
	@DisplayName("Record 2561: County is Kent")
	void CountyOfRecord2561() {
		assertEquals("Kent", customers.get(2560).getCounty());
	}

	@Test
	@DisplayName("Record 2561: State is MI")
	void StateOfRecord2561() {
		assertEquals("MI", customers.get(2560).getState());
	}

	@Test
	@DisplayName("Record 2561: ZIP is 49507")
	void ZIPOfRecord2561() {
		assertEquals("49507", customers.get(2560).getZIP());
	}

	@Test
	@DisplayName("Record 2561: Phone is 616-243-6530")
	void PhoneOfRecord2561() {
		assertEquals("616-243-6530", customers.get(2560).getPhone());
	}

	@Test
	@DisplayName("Record 2561: Fax is 616-243-7723")
	void FaxOfRecord2561() {
		assertEquals("616-243-7723", customers.get(2560).getFax());
	}

	@Test
	@DisplayName("Record 2561: Email is evan@nepomuceno.com")
	void EmailOfRecord2561() {
		assertEquals("evan@nepomuceno.com", customers.get(2560).getEmail());
	}

	@Test
	@DisplayName("Record 2561: Web is http://www.evannepomuceno.com")
	void WebOfRecord2561() {
		assertEquals("http://www.evannepomuceno.com", customers.get(2560).getWeb());
	}
}
