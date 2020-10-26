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

@Tag("24")
class Record_1112 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1112: FirstName is Anna")
	void FirstNameOfRecord1112() {
		assertEquals("Anna", customers.get(1111).getFirstName());
	}

	@Test
	@DisplayName("Record 1112: LastName is Scheuer")
	void LastNameOfRecord1112() {
		assertEquals("Scheuer", customers.get(1111).getLastName());
	}

	@Test
	@DisplayName("Record 1112: Company is C R Hassinger Grading Co")
	void CompanyOfRecord1112() {
		assertEquals("C R Hassinger Grading Co", customers.get(1111).getCompany());
	}

	@Test
	@DisplayName("Record 1112: Address is 411 S Main St")
	void AddressOfRecord1112() {
		assertEquals("411 S Main St", customers.get(1111).getAddress());
	}

	@Test
	@DisplayName("Record 1112: City is Rochester")
	void CityOfRecord1112() {
		assertEquals("Rochester", customers.get(1111).getCity());
	}

	@Test
	@DisplayName("Record 1112: County is Oakland")
	void CountyOfRecord1112() {
		assertEquals("Oakland", customers.get(1111).getCounty());
	}

	@Test
	@DisplayName("Record 1112: State is MI")
	void StateOfRecord1112() {
		assertEquals("MI", customers.get(1111).getState());
	}

	@Test
	@DisplayName("Record 1112: ZIP is 48307")
	void ZIPOfRecord1112() {
		assertEquals("48307", customers.get(1111).getZIP());
	}

	@Test
	@DisplayName("Record 1112: Phone is 248-652-8541")
	void PhoneOfRecord1112() {
		assertEquals("248-652-8541", customers.get(1111).getPhone());
	}

	@Test
	@DisplayName("Record 1112: Fax is 248-652-7367")
	void FaxOfRecord1112() {
		assertEquals("248-652-7367", customers.get(1111).getFax());
	}

	@Test
	@DisplayName("Record 1112: Email is anna@scheuer.com")
	void EmailOfRecord1112() {
		assertEquals("anna@scheuer.com", customers.get(1111).getEmail());
	}

	@Test
	@DisplayName("Record 1112: Web is http://www.annascheuer.com")
	void WebOfRecord1112() {
		assertEquals("http://www.annascheuer.com", customers.get(1111).getWeb());
	}
}
