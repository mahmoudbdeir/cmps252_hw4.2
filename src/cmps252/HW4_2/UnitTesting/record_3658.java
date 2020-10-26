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

@Tag("13")
class Record_3658 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3658: FirstName is Marva")
	void FirstNameOfRecord3658() {
		assertEquals("Marva", customers.get(3657).getFirstName());
	}

	@Test
	@DisplayName("Record 3658: LastName is Servoss")
	void LastNameOfRecord3658() {
		assertEquals("Servoss", customers.get(3657).getLastName());
	}

	@Test
	@DisplayName("Record 3658: Company is Lovett & Company Ltd")
	void CompanyOfRecord3658() {
		assertEquals("Lovett & Company Ltd", customers.get(3657).getCompany());
	}

	@Test
	@DisplayName("Record 3658: Address is 108 N Washington Ave")
	void AddressOfRecord3658() {
		assertEquals("108 N Washington Ave", customers.get(3657).getAddress());
	}

	@Test
	@DisplayName("Record 3658: City is Scranton")
	void CityOfRecord3658() {
		assertEquals("Scranton", customers.get(3657).getCity());
	}

	@Test
	@DisplayName("Record 3658: County is Lackawanna")
	void CountyOfRecord3658() {
		assertEquals("Lackawanna", customers.get(3657).getCounty());
	}

	@Test
	@DisplayName("Record 3658: State is PA")
	void StateOfRecord3658() {
		assertEquals("PA", customers.get(3657).getState());
	}

	@Test
	@DisplayName("Record 3658: ZIP is 18503")
	void ZIPOfRecord3658() {
		assertEquals("18503", customers.get(3657).getZIP());
	}

	@Test
	@DisplayName("Record 3658: Phone is 570-341-2886")
	void PhoneOfRecord3658() {
		assertEquals("570-341-2886", customers.get(3657).getPhone());
	}

	@Test
	@DisplayName("Record 3658: Fax is 570-341-4407")
	void FaxOfRecord3658() {
		assertEquals("570-341-4407", customers.get(3657).getFax());
	}

	@Test
	@DisplayName("Record 3658: Email is marva@servoss.com")
	void EmailOfRecord3658() {
		assertEquals("marva@servoss.com", customers.get(3657).getEmail());
	}

	@Test
	@DisplayName("Record 3658: Web is http://www.marvaservoss.com")
	void WebOfRecord3658() {
		assertEquals("http://www.marvaservoss.com", customers.get(3657).getWeb());
	}
}
