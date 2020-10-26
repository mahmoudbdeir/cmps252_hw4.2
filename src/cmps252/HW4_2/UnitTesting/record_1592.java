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

@Tag("33")
class Record_1592 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1592: FirstName is Kerry")
	void FirstNameOfRecord1592() {
		assertEquals("Kerry", customers.get(1591).getFirstName());
	}

	@Test
	@DisplayName("Record 1592: LastName is Brakebill")
	void LastNameOfRecord1592() {
		assertEquals("Brakebill", customers.get(1591).getLastName());
	}

	@Test
	@DisplayName("Record 1592: Company is Kinkos Copies")
	void CompanyOfRecord1592() {
		assertEquals("Kinkos Copies", customers.get(1591).getCompany());
	}

	@Test
	@DisplayName("Record 1592: Address is 356 Middle Country Rd  #-20520")
	void AddressOfRecord1592() {
		assertEquals("356 Middle Country Rd  #-20520", customers.get(1591).getAddress());
	}

	@Test
	@DisplayName("Record 1592: City is Coram")
	void CityOfRecord1592() {
		assertEquals("Coram", customers.get(1591).getCity());
	}

	@Test
	@DisplayName("Record 1592: County is Suffolk")
	void CountyOfRecord1592() {
		assertEquals("Suffolk", customers.get(1591).getCounty());
	}

	@Test
	@DisplayName("Record 1592: State is NY")
	void StateOfRecord1592() {
		assertEquals("NY", customers.get(1591).getState());
	}

	@Test
	@DisplayName("Record 1592: ZIP is 11727")
	void ZIPOfRecord1592() {
		assertEquals("11727", customers.get(1591).getZIP());
	}

	@Test
	@DisplayName("Record 1592: Phone is 631-736-5356")
	void PhoneOfRecord1592() {
		assertEquals("631-736-5356", customers.get(1591).getPhone());
	}

	@Test
	@DisplayName("Record 1592: Fax is 631-736-8078")
	void FaxOfRecord1592() {
		assertEquals("631-736-8078", customers.get(1591).getFax());
	}

	@Test
	@DisplayName("Record 1592: Email is kerry@brakebill.com")
	void EmailOfRecord1592() {
		assertEquals("kerry@brakebill.com", customers.get(1591).getEmail());
	}

	@Test
	@DisplayName("Record 1592: Web is http://www.kerrybrakebill.com")
	void WebOfRecord1592() {
		assertEquals("http://www.kerrybrakebill.com", customers.get(1591).getWeb());
	}
}
