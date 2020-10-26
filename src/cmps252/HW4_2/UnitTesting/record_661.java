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

@Tag("41")
class Record_661 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 661: FirstName is Deloris")
	void FirstNameOfRecord661() {
		assertEquals("Deloris", customers.get(660).getFirstName());
	}

	@Test
	@DisplayName("Record 661: LastName is Ronero")
	void LastNameOfRecord661() {
		assertEquals("Ronero", customers.get(660).getLastName());
	}

	@Test
	@DisplayName("Record 661: Company is X S Hair Unlimited")
	void CompanyOfRecord661() {
		assertEquals("X S Hair Unlimited", customers.get(660).getCompany());
	}

	@Test
	@DisplayName("Record 661: Address is 328 Highland Ave")
	void AddressOfRecord661() {
		assertEquals("328 Highland Ave", customers.get(660).getAddress());
	}

	@Test
	@DisplayName("Record 661: City is Downingtown")
	void CityOfRecord661() {
		assertEquals("Downingtown", customers.get(660).getCity());
	}

	@Test
	@DisplayName("Record 661: County is Chester")
	void CountyOfRecord661() {
		assertEquals("Chester", customers.get(660).getCounty());
	}

	@Test
	@DisplayName("Record 661: State is PA")
	void StateOfRecord661() {
		assertEquals("PA", customers.get(660).getState());
	}

	@Test
	@DisplayName("Record 661: ZIP is 19335")
	void ZIPOfRecord661() {
		assertEquals("19335", customers.get(660).getZIP());
	}

	@Test
	@DisplayName("Record 661: Phone is 610-873-0476")
	void PhoneOfRecord661() {
		assertEquals("610-873-0476", customers.get(660).getPhone());
	}

	@Test
	@DisplayName("Record 661: Fax is 610-873-6052")
	void FaxOfRecord661() {
		assertEquals("610-873-6052", customers.get(660).getFax());
	}

	@Test
	@DisplayName("Record 661: Email is deloris@ronero.com")
	void EmailOfRecord661() {
		assertEquals("deloris@ronero.com", customers.get(660).getEmail());
	}

	@Test
	@DisplayName("Record 661: Web is http://www.delorisronero.com")
	void WebOfRecord661() {
		assertEquals("http://www.delorisronero.com", customers.get(660).getWeb());
	}
}
