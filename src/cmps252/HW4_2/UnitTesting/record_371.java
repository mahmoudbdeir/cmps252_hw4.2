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

@Tag("49")
class Record_371 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 371: FirstName is Robyn")
	void FirstNameOfRecord371() {
		assertEquals("Robyn", customers.get(370).getFirstName());
	}

	@Test
	@DisplayName("Record 371: LastName is Covell")
	void LastNameOfRecord371() {
		assertEquals("Covell", customers.get(370).getLastName());
	}

	@Test
	@DisplayName("Record 371: Company is Brewer & Pritchard")
	void CompanyOfRecord371() {
		assertEquals("Brewer & Pritchard", customers.get(370).getCompany());
	}

	@Test
	@DisplayName("Record 371: Address is 85 Woodlawn Ave")
	void AddressOfRecord371() {
		assertEquals("85 Woodlawn Ave", customers.get(370).getAddress());
	}

	@Test
	@DisplayName("Record 371: City is South Portland")
	void CityOfRecord371() {
		assertEquals("South Portland", customers.get(370).getCity());
	}

	@Test
	@DisplayName("Record 371: County is Cumberland")
	void CountyOfRecord371() {
		assertEquals("Cumberland", customers.get(370).getCounty());
	}

	@Test
	@DisplayName("Record 371: State is ME")
	void StateOfRecord371() {
		assertEquals("ME", customers.get(370).getState());
	}

	@Test
	@DisplayName("Record 371: ZIP is 4106")
	void ZIPOfRecord371() {
		assertEquals("4106", customers.get(370).getZIP());
	}

	@Test
	@DisplayName("Record 371: Phone is 207-767-7956")
	void PhoneOfRecord371() {
		assertEquals("207-767-7956", customers.get(370).getPhone());
	}

	@Test
	@DisplayName("Record 371: Fax is 207-767-2714")
	void FaxOfRecord371() {
		assertEquals("207-767-2714", customers.get(370).getFax());
	}

	@Test
	@DisplayName("Record 371: Email is robyn@covell.com")
	void EmailOfRecord371() {
		assertEquals("robyn@covell.com", customers.get(370).getEmail());
	}

	@Test
	@DisplayName("Record 371: Web is http://www.robyncovell.com")
	void WebOfRecord371() {
		assertEquals("http://www.robyncovell.com", customers.get(370).getWeb());
	}
}
