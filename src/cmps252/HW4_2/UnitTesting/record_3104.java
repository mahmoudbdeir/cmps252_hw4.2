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
class Record_3104 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3104: FirstName is Ericka")
	void FirstNameOfRecord3104() {
		assertEquals("Ericka", customers.get(3103).getFirstName());
	}

	@Test
	@DisplayName("Record 3104: LastName is Galietti")
	void LastNameOfRecord3104() {
		assertEquals("Galietti", customers.get(3103).getLastName());
	}

	@Test
	@DisplayName("Record 3104: Company is Mts Scaffold Inc")
	void CompanyOfRecord3104() {
		assertEquals("Mts Scaffold Inc", customers.get(3103).getCompany());
	}

	@Test
	@DisplayName("Record 3104: Address is 937 Youngstown Warren Rd")
	void AddressOfRecord3104() {
		assertEquals("937 Youngstown Warren Rd", customers.get(3103).getAddress());
	}

	@Test
	@DisplayName("Record 3104: City is Niles")
	void CityOfRecord3104() {
		assertEquals("Niles", customers.get(3103).getCity());
	}

	@Test
	@DisplayName("Record 3104: County is Trumbull")
	void CountyOfRecord3104() {
		assertEquals("Trumbull", customers.get(3103).getCounty());
	}

	@Test
	@DisplayName("Record 3104: State is OH")
	void StateOfRecord3104() {
		assertEquals("OH", customers.get(3103).getState());
	}

	@Test
	@DisplayName("Record 3104: ZIP is 44446")
	void ZIPOfRecord3104() {
		assertEquals("44446", customers.get(3103).getZIP());
	}

	@Test
	@DisplayName("Record 3104: Phone is 330-652-7269")
	void PhoneOfRecord3104() {
		assertEquals("330-652-7269", customers.get(3103).getPhone());
	}

	@Test
	@DisplayName("Record 3104: Fax is 330-652-1195")
	void FaxOfRecord3104() {
		assertEquals("330-652-1195", customers.get(3103).getFax());
	}

	@Test
	@DisplayName("Record 3104: Email is ericka@galietti.com")
	void EmailOfRecord3104() {
		assertEquals("ericka@galietti.com", customers.get(3103).getEmail());
	}

	@Test
	@DisplayName("Record 3104: Web is http://www.erickagalietti.com")
	void WebOfRecord3104() {
		assertEquals("http://www.erickagalietti.com", customers.get(3103).getWeb());
	}
}
