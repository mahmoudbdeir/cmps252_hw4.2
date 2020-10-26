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

@Tag("7")
class Record_1667 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1667: FirstName is Ethel")
	void FirstNameOfRecord1667() {
		assertEquals("Ethel", customers.get(1666).getFirstName());
	}

	@Test
	@DisplayName("Record 1667: LastName is Nanfito")
	void LastNameOfRecord1667() {
		assertEquals("Nanfito", customers.get(1666).getLastName());
	}

	@Test
	@DisplayName("Record 1667: Company is Alto Mfg Co")
	void CompanyOfRecord1667() {
		assertEquals("Alto Mfg Co", customers.get(1666).getCompany());
	}

	@Test
	@DisplayName("Record 1667: Address is 30800 Telegraph Rd")
	void AddressOfRecord1667() {
		assertEquals("30800 Telegraph Rd", customers.get(1666).getAddress());
	}

	@Test
	@DisplayName("Record 1667: City is Franklin")
	void CityOfRecord1667() {
		assertEquals("Franklin", customers.get(1666).getCity());
	}

	@Test
	@DisplayName("Record 1667: County is Oakland")
	void CountyOfRecord1667() {
		assertEquals("Oakland", customers.get(1666).getCounty());
	}

	@Test
	@DisplayName("Record 1667: State is MI")
	void StateOfRecord1667() {
		assertEquals("MI", customers.get(1666).getState());
	}

	@Test
	@DisplayName("Record 1667: ZIP is 48025")
	void ZIPOfRecord1667() {
		assertEquals("48025", customers.get(1666).getZIP());
	}

	@Test
	@DisplayName("Record 1667: Phone is 248-258-0729")
	void PhoneOfRecord1667() {
		assertEquals("248-258-0729", customers.get(1666).getPhone());
	}

	@Test
	@DisplayName("Record 1667: Fax is 248-258-6608")
	void FaxOfRecord1667() {
		assertEquals("248-258-6608", customers.get(1666).getFax());
	}

	@Test
	@DisplayName("Record 1667: Email is ethel@nanfito.com")
	void EmailOfRecord1667() {
		assertEquals("ethel@nanfito.com", customers.get(1666).getEmail());
	}

	@Test
	@DisplayName("Record 1667: Web is http://www.ethelnanfito.com")
	void WebOfRecord1667() {
		assertEquals("http://www.ethelnanfito.com", customers.get(1666).getWeb());
	}
}
