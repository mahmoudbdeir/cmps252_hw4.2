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

@Tag("26")
class Record_3742 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3742: FirstName is Edwina")
	void FirstNameOfRecord3742() {
		assertEquals("Edwina", customers.get(3741).getFirstName());
	}

	@Test
	@DisplayName("Record 3742: LastName is Joeckel")
	void LastNameOfRecord3742() {
		assertEquals("Joeckel", customers.get(3741).getLastName());
	}

	@Test
	@DisplayName("Record 3742: Company is Bauer, Charles B Esq")
	void CompanyOfRecord3742() {
		assertEquals("Bauer, Charles B Esq", customers.get(3741).getCompany());
	}

	@Test
	@DisplayName("Record 3742: Address is 300 E Jefferson St")
	void AddressOfRecord3742() {
		assertEquals("300 E Jefferson St", customers.get(3741).getAddress());
	}

	@Test
	@DisplayName("Record 3742: City is Monroe")
	void CityOfRecord3742() {
		assertEquals("Monroe", customers.get(3741).getCity());
	}

	@Test
	@DisplayName("Record 3742: County is Union")
	void CountyOfRecord3742() {
		assertEquals("Union", customers.get(3741).getCounty());
	}

	@Test
	@DisplayName("Record 3742: State is NC")
	void StateOfRecord3742() {
		assertEquals("NC", customers.get(3741).getState());
	}

	@Test
	@DisplayName("Record 3742: ZIP is 28112")
	void ZIPOfRecord3742() {
		assertEquals("28112", customers.get(3741).getZIP());
	}

	@Test
	@DisplayName("Record 3742: Phone is 704-283-5060")
	void PhoneOfRecord3742() {
		assertEquals("704-283-5060", customers.get(3741).getPhone());
	}

	@Test
	@DisplayName("Record 3742: Fax is 704-283-2074")
	void FaxOfRecord3742() {
		assertEquals("704-283-2074", customers.get(3741).getFax());
	}

	@Test
	@DisplayName("Record 3742: Email is edwina@joeckel.com")
	void EmailOfRecord3742() {
		assertEquals("edwina@joeckel.com", customers.get(3741).getEmail());
	}

	@Test
	@DisplayName("Record 3742: Web is http://www.edwinajoeckel.com")
	void WebOfRecord3742() {
		assertEquals("http://www.edwinajoeckel.com", customers.get(3741).getWeb());
	}
}
