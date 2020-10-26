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

@Tag("38")
class Record_3949 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3949: FirstName is Felecia")
	void FirstNameOfRecord3949() {
		assertEquals("Felecia", customers.get(3948).getFirstName());
	}

	@Test
	@DisplayName("Record 3949: LastName is Calco")
	void LastNameOfRecord3949() {
		assertEquals("Calco", customers.get(3948).getLastName());
	}

	@Test
	@DisplayName("Record 3949: Company is B T Properties")
	void CompanyOfRecord3949() {
		assertEquals("B T Properties", customers.get(3948).getCompany());
	}

	@Test
	@DisplayName("Record 3949: Address is 426 S Westgate St")
	void AddressOfRecord3949() {
		assertEquals("426 S Westgate St", customers.get(3948).getAddress());
	}

	@Test
	@DisplayName("Record 3949: City is Addison")
	void CityOfRecord3949() {
		assertEquals("Addison", customers.get(3948).getCity());
	}

	@Test
	@DisplayName("Record 3949: County is DuPage")
	void CountyOfRecord3949() {
		assertEquals("DuPage", customers.get(3948).getCounty());
	}

	@Test
	@DisplayName("Record 3949: State is IL")
	void StateOfRecord3949() {
		assertEquals("IL", customers.get(3948).getState());
	}

	@Test
	@DisplayName("Record 3949: ZIP is 60101")
	void ZIPOfRecord3949() {
		assertEquals("60101", customers.get(3948).getZIP());
	}

	@Test
	@DisplayName("Record 3949: Phone is 630-543-7012")
	void PhoneOfRecord3949() {
		assertEquals("630-543-7012", customers.get(3948).getPhone());
	}

	@Test
	@DisplayName("Record 3949: Fax is 630-543-1757")
	void FaxOfRecord3949() {
		assertEquals("630-543-1757", customers.get(3948).getFax());
	}

	@Test
	@DisplayName("Record 3949: Email is felecia@calco.com")
	void EmailOfRecord3949() {
		assertEquals("felecia@calco.com", customers.get(3948).getEmail());
	}

	@Test
	@DisplayName("Record 3949: Web is http://www.feleciacalco.com")
	void WebOfRecord3949() {
		assertEquals("http://www.feleciacalco.com", customers.get(3948).getWeb());
	}
}
