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
class Record_2008 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2008: FirstName is Larissa")
	void FirstNameOfRecord2008() {
		assertEquals("Larissa", customers.get(2007).getFirstName());
	}

	@Test
	@DisplayName("Record 2008: LastName is Secor")
	void LastNameOfRecord2008() {
		assertEquals("Secor", customers.get(2007).getLastName());
	}

	@Test
	@DisplayName("Record 2008: Company is Garvis, Marlene S Esq")
	void CompanyOfRecord2008() {
		assertEquals("Garvis, Marlene S Esq", customers.get(2007).getCompany());
	}

	@Test
	@DisplayName("Record 2008: Address is Putter Ln")
	void AddressOfRecord2008() {
		assertEquals("Putter Ln", customers.get(2007).getAddress());
	}

	@Test
	@DisplayName("Record 2008: City is Middle Island")
	void CityOfRecord2008() {
		assertEquals("Middle Island", customers.get(2007).getCity());
	}

	@Test
	@DisplayName("Record 2008: County is Suffolk")
	void CountyOfRecord2008() {
		assertEquals("Suffolk", customers.get(2007).getCounty());
	}

	@Test
	@DisplayName("Record 2008: State is NY")
	void StateOfRecord2008() {
		assertEquals("NY", customers.get(2007).getState());
	}

	@Test
	@DisplayName("Record 2008: ZIP is 11953")
	void ZIPOfRecord2008() {
		assertEquals("11953", customers.get(2007).getZIP());
	}

	@Test
	@DisplayName("Record 2008: Phone is 631-924-2033")
	void PhoneOfRecord2008() {
		assertEquals("631-924-2033", customers.get(2007).getPhone());
	}

	@Test
	@DisplayName("Record 2008: Fax is 631-924-5642")
	void FaxOfRecord2008() {
		assertEquals("631-924-5642", customers.get(2007).getFax());
	}

	@Test
	@DisplayName("Record 2008: Email is larissa@secor.com")
	void EmailOfRecord2008() {
		assertEquals("larissa@secor.com", customers.get(2007).getEmail());
	}

	@Test
	@DisplayName("Record 2008: Web is http://www.larissasecor.com")
	void WebOfRecord2008() {
		assertEquals("http://www.larissasecor.com", customers.get(2007).getWeb());
	}
}
