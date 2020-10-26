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

@Tag("19")
class Record_3195 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3195: FirstName is Erika")
	void FirstNameOfRecord3195() {
		assertEquals("Erika", customers.get(3194).getFirstName());
	}

	@Test
	@DisplayName("Record 3195: LastName is Pessoa")
	void LastNameOfRecord3195() {
		assertEquals("Pessoa", customers.get(3194).getLastName());
	}

	@Test
	@DisplayName("Record 3195: Company is Jacksonville Fire Ext Svc")
	void CompanyOfRecord3195() {
		assertEquals("Jacksonville Fire Ext Svc", customers.get(3194).getCompany());
	}

	@Test
	@DisplayName("Record 3195: Address is 48 Free St")
	void AddressOfRecord3195() {
		assertEquals("48 Free St", customers.get(3194).getAddress());
	}

	@Test
	@DisplayName("Record 3195: City is Portland")
	void CityOfRecord3195() {
		assertEquals("Portland", customers.get(3194).getCity());
	}

	@Test
	@DisplayName("Record 3195: County is Cumberland")
	void CountyOfRecord3195() {
		assertEquals("Cumberland", customers.get(3194).getCounty());
	}

	@Test
	@DisplayName("Record 3195: State is ME")
	void StateOfRecord3195() {
		assertEquals("ME", customers.get(3194).getState());
	}

	@Test
	@DisplayName("Record 3195: ZIP is 4101")
	void ZIPOfRecord3195() {
		assertEquals("4101", customers.get(3194).getZIP());
	}

	@Test
	@DisplayName("Record 3195: Phone is 207-871-1940")
	void PhoneOfRecord3195() {
		assertEquals("207-871-1940", customers.get(3194).getPhone());
	}

	@Test
	@DisplayName("Record 3195: Fax is 207-871-6467")
	void FaxOfRecord3195() {
		assertEquals("207-871-6467", customers.get(3194).getFax());
	}

	@Test
	@DisplayName("Record 3195: Email is erika@pessoa.com")
	void EmailOfRecord3195() {
		assertEquals("erika@pessoa.com", customers.get(3194).getEmail());
	}

	@Test
	@DisplayName("Record 3195: Web is http://www.erikapessoa.com")
	void WebOfRecord3195() {
		assertEquals("http://www.erikapessoa.com", customers.get(3194).getWeb());
	}
}
