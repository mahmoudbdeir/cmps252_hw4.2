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

@Tag("47")
class Record_2648 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2648: FirstName is Thad")
	void FirstNameOfRecord2648() {
		assertEquals("Thad", customers.get(2647).getFirstName());
	}

	@Test
	@DisplayName("Record 2648: LastName is Fiorito")
	void LastNameOfRecord2648() {
		assertEquals("Fiorito", customers.get(2647).getLastName());
	}

	@Test
	@DisplayName("Record 2648: Company is Evers, John F Esq")
	void CompanyOfRecord2648() {
		assertEquals("Evers, John F Esq", customers.get(2647).getCompany());
	}

	@Test
	@DisplayName("Record 2648: Address is 24 S Main St")
	void AddressOfRecord2648() {
		assertEquals("24 S Main St", customers.get(2647).getAddress());
	}

	@Test
	@DisplayName("Record 2648: City is Churchville")
	void CityOfRecord2648() {
		assertEquals("Churchville", customers.get(2647).getCity());
	}

	@Test
	@DisplayName("Record 2648: County is Monroe")
	void CountyOfRecord2648() {
		assertEquals("Monroe", customers.get(2647).getCounty());
	}

	@Test
	@DisplayName("Record 2648: State is NY")
	void StateOfRecord2648() {
		assertEquals("NY", customers.get(2647).getState());
	}

	@Test
	@DisplayName("Record 2648: ZIP is 14428")
	void ZIPOfRecord2648() {
		assertEquals("14428", customers.get(2647).getZIP());
	}

	@Test
	@DisplayName("Record 2648: Phone is 585-293-8874")
	void PhoneOfRecord2648() {
		assertEquals("585-293-8874", customers.get(2647).getPhone());
	}

	@Test
	@DisplayName("Record 2648: Fax is 585-293-1336")
	void FaxOfRecord2648() {
		assertEquals("585-293-1336", customers.get(2647).getFax());
	}

	@Test
	@DisplayName("Record 2648: Email is thad@fiorito.com")
	void EmailOfRecord2648() {
		assertEquals("thad@fiorito.com", customers.get(2647).getEmail());
	}

	@Test
	@DisplayName("Record 2648: Web is http://www.thadfiorito.com")
	void WebOfRecord2648() {
		assertEquals("http://www.thadfiorito.com", customers.get(2647).getWeb());
	}
}
