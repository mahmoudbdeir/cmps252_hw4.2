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

@Tag("28")
class Record_3411 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3411: FirstName is Vince")
	void FirstNameOfRecord3411() {
		assertEquals("Vince", customers.get(3410).getFirstName());
	}

	@Test
	@DisplayName("Record 3411: LastName is Vanostrand")
	void LastNameOfRecord3411() {
		assertEquals("Vanostrand", customers.get(3410).getLastName());
	}

	@Test
	@DisplayName("Record 3411: Company is Deese, J Melvin Jr")
	void CompanyOfRecord3411() {
		assertEquals("Deese, J Melvin Jr", customers.get(3410).getCompany());
	}

	@Test
	@DisplayName("Record 3411: Address is 450 Saint John Rd  #-103")
	void AddressOfRecord3411() {
		assertEquals("450 Saint John Rd  #-103", customers.get(3410).getAddress());
	}

	@Test
	@DisplayName("Record 3411: City is Michigan City")
	void CityOfRecord3411() {
		assertEquals("Michigan City", customers.get(3410).getCity());
	}

	@Test
	@DisplayName("Record 3411: County is La Porte")
	void CountyOfRecord3411() {
		assertEquals("La Porte", customers.get(3410).getCounty());
	}

	@Test
	@DisplayName("Record 3411: State is IN")
	void StateOfRecord3411() {
		assertEquals("IN", customers.get(3410).getState());
	}

	@Test
	@DisplayName("Record 3411: ZIP is 46360")
	void ZIPOfRecord3411() {
		assertEquals("46360", customers.get(3410).getZIP());
	}

	@Test
	@DisplayName("Record 3411: Phone is 219-878-9948")
	void PhoneOfRecord3411() {
		assertEquals("219-878-9948", customers.get(3410).getPhone());
	}

	@Test
	@DisplayName("Record 3411: Fax is 219-878-8339")
	void FaxOfRecord3411() {
		assertEquals("219-878-8339", customers.get(3410).getFax());
	}

	@Test
	@DisplayName("Record 3411: Email is vince@vanostrand.com")
	void EmailOfRecord3411() {
		assertEquals("vince@vanostrand.com", customers.get(3410).getEmail());
	}

	@Test
	@DisplayName("Record 3411: Web is http://www.vincevanostrand.com")
	void WebOfRecord3411() {
		assertEquals("http://www.vincevanostrand.com", customers.get(3410).getWeb());
	}
}
