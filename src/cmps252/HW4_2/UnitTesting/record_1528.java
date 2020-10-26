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

@Tag("30")
class Record_1528 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1528: FirstName is Terra")
	void FirstNameOfRecord1528() {
		assertEquals("Terra", customers.get(1527).getFirstName());
	}

	@Test
	@DisplayName("Record 1528: LastName is Marolda")
	void LastNameOfRecord1528() {
		assertEquals("Marolda", customers.get(1527).getLastName());
	}

	@Test
	@DisplayName("Record 1528: Company is Interstate Hydraulics")
	void CompanyOfRecord1528() {
		assertEquals("Interstate Hydraulics", customers.get(1527).getCompany());
	}

	@Test
	@DisplayName("Record 1528: Address is 539 Oronoque Rd")
	void AddressOfRecord1528() {
		assertEquals("539 Oronoque Rd", customers.get(1527).getAddress());
	}

	@Test
	@DisplayName("Record 1528: City is Milford")
	void CityOfRecord1528() {
		assertEquals("Milford", customers.get(1527).getCity());
	}

	@Test
	@DisplayName("Record 1528: County is New Haven")
	void CountyOfRecord1528() {
		assertEquals("New Haven", customers.get(1527).getCounty());
	}

	@Test
	@DisplayName("Record 1528: State is CT")
	void StateOfRecord1528() {
		assertEquals("CT", customers.get(1527).getState());
	}

	@Test
	@DisplayName("Record 1528: ZIP is 6460")
	void ZIPOfRecord1528() {
		assertEquals("6460", customers.get(1527).getZIP());
	}

	@Test
	@DisplayName("Record 1528: Phone is 203-783-5892")
	void PhoneOfRecord1528() {
		assertEquals("203-783-5892", customers.get(1527).getPhone());
	}

	@Test
	@DisplayName("Record 1528: Fax is 203-783-5943")
	void FaxOfRecord1528() {
		assertEquals("203-783-5943", customers.get(1527).getFax());
	}

	@Test
	@DisplayName("Record 1528: Email is terra@marolda.com")
	void EmailOfRecord1528() {
		assertEquals("terra@marolda.com", customers.get(1527).getEmail());
	}

	@Test
	@DisplayName("Record 1528: Web is http://www.terramarolda.com")
	void WebOfRecord1528() {
		assertEquals("http://www.terramarolda.com", customers.get(1527).getWeb());
	}
}
