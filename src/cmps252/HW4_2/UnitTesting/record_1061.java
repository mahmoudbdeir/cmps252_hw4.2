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

@Tag("39")
class Record_1061 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1061: FirstName is Tanya")
	void FirstNameOfRecord1061() {
		assertEquals("Tanya", customers.get(1060).getFirstName());
	}

	@Test
	@DisplayName("Record 1061: LastName is Resch")
	void LastNameOfRecord1061() {
		assertEquals("Resch", customers.get(1060).getLastName());
	}

	@Test
	@DisplayName("Record 1061: Company is Berry, Timothy H Esq")
	void CompanyOfRecord1061() {
		assertEquals("Berry, Timothy H Esq", customers.get(1060).getCompany());
	}

	@Test
	@DisplayName("Record 1061: Address is 125 E Idaho St  #-101")
	void AddressOfRecord1061() {
		assertEquals("125 E Idaho St  #-101", customers.get(1060).getAddress());
	}

	@Test
	@DisplayName("Record 1061: City is Boise")
	void CityOfRecord1061() {
		assertEquals("Boise", customers.get(1060).getCity());
	}

	@Test
	@DisplayName("Record 1061: County is Ada")
	void CountyOfRecord1061() {
		assertEquals("Ada", customers.get(1060).getCounty());
	}

	@Test
	@DisplayName("Record 1061: State is ID")
	void StateOfRecord1061() {
		assertEquals("ID", customers.get(1060).getState());
	}

	@Test
	@DisplayName("Record 1061: ZIP is 83712")
	void ZIPOfRecord1061() {
		assertEquals("83712", customers.get(1060).getZIP());
	}

	@Test
	@DisplayName("Record 1061: Phone is 208-345-6955")
	void PhoneOfRecord1061() {
		assertEquals("208-345-6955", customers.get(1060).getPhone());
	}

	@Test
	@DisplayName("Record 1061: Fax is 208-345-2837")
	void FaxOfRecord1061() {
		assertEquals("208-345-2837", customers.get(1060).getFax());
	}

	@Test
	@DisplayName("Record 1061: Email is tanya@resch.com")
	void EmailOfRecord1061() {
		assertEquals("tanya@resch.com", customers.get(1060).getEmail());
	}

	@Test
	@DisplayName("Record 1061: Web is http://www.tanyaresch.com")
	void WebOfRecord1061() {
		assertEquals("http://www.tanyaresch.com", customers.get(1060).getWeb());
	}
}
