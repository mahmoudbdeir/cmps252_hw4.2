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
class Record_543 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 543: FirstName is Lane")
	void FirstNameOfRecord543() {
		assertEquals("Lane", customers.get(542).getFirstName());
	}

	@Test
	@DisplayName("Record 543: LastName is Bryhan")
	void LastNameOfRecord543() {
		assertEquals("Bryhan", customers.get(542).getLastName());
	}

	@Test
	@DisplayName("Record 543: Company is Omars Massage & Stress Release")
	void CompanyOfRecord543() {
		assertEquals("Omars Massage & Stress Release", customers.get(542).getCompany());
	}

	@Test
	@DisplayName("Record 543: Address is 14 E Kingsbridge Rd")
	void AddressOfRecord543() {
		assertEquals("14 E Kingsbridge Rd", customers.get(542).getAddress());
	}

	@Test
	@DisplayName("Record 543: City is Bronx")
	void CityOfRecord543() {
		assertEquals("Bronx", customers.get(542).getCity());
	}

	@Test
	@DisplayName("Record 543: County is Bronx")
	void CountyOfRecord543() {
		assertEquals("Bronx", customers.get(542).getCounty());
	}

	@Test
	@DisplayName("Record 543: State is NY")
	void StateOfRecord543() {
		assertEquals("NY", customers.get(542).getState());
	}

	@Test
	@DisplayName("Record 543: ZIP is 10468")
	void ZIPOfRecord543() {
		assertEquals("10468", customers.get(542).getZIP());
	}

	@Test
	@DisplayName("Record 543: Phone is 718-367-1201")
	void PhoneOfRecord543() {
		assertEquals("718-367-1201", customers.get(542).getPhone());
	}

	@Test
	@DisplayName("Record 543: Fax is 718-367-4144")
	void FaxOfRecord543() {
		assertEquals("718-367-4144", customers.get(542).getFax());
	}

	@Test
	@DisplayName("Record 543: Email is lane@bryhan.com")
	void EmailOfRecord543() {
		assertEquals("lane@bryhan.com", customers.get(542).getEmail());
	}

	@Test
	@DisplayName("Record 543: Web is http://www.lanebryhan.com")
	void WebOfRecord543() {
		assertEquals("http://www.lanebryhan.com", customers.get(542).getWeb());
	}
}
