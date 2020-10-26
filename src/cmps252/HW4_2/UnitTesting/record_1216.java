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

@Tag("45")
class Record_1216 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1216: FirstName is Althea")
	void FirstNameOfRecord1216() {
		assertEquals("Althea", customers.get(1215).getFirstName());
	}

	@Test
	@DisplayName("Record 1216: LastName is Portalatin")
	void LastNameOfRecord1216() {
		assertEquals("Portalatin", customers.get(1215).getLastName());
	}

	@Test
	@DisplayName("Record 1216: Company is Denmark, Gerald A Esq")
	void CompanyOfRecord1216() {
		assertEquals("Denmark, Gerald A Esq", customers.get(1215).getCompany());
	}

	@Test
	@DisplayName("Record 1216: Address is 190 Willow Ave")
	void AddressOfRecord1216() {
		assertEquals("190 Willow Ave", customers.get(1215).getAddress());
	}

	@Test
	@DisplayName("Record 1216: City is Bronx")
	void CityOfRecord1216() {
		assertEquals("Bronx", customers.get(1215).getCity());
	}

	@Test
	@DisplayName("Record 1216: County is Bronx")
	void CountyOfRecord1216() {
		assertEquals("Bronx", customers.get(1215).getCounty());
	}

	@Test
	@DisplayName("Record 1216: State is NY")
	void StateOfRecord1216() {
		assertEquals("NY", customers.get(1215).getState());
	}

	@Test
	@DisplayName("Record 1216: ZIP is 10454")
	void ZIPOfRecord1216() {
		assertEquals("10454", customers.get(1215).getZIP());
	}

	@Test
	@DisplayName("Record 1216: Phone is 718-402-4473")
	void PhoneOfRecord1216() {
		assertEquals("718-402-4473", customers.get(1215).getPhone());
	}

	@Test
	@DisplayName("Record 1216: Fax is 718-402-2252")
	void FaxOfRecord1216() {
		assertEquals("718-402-2252", customers.get(1215).getFax());
	}

	@Test
	@DisplayName("Record 1216: Email is althea@portalatin.com")
	void EmailOfRecord1216() {
		assertEquals("althea@portalatin.com", customers.get(1215).getEmail());
	}

	@Test
	@DisplayName("Record 1216: Web is http://www.altheaportalatin.com")
	void WebOfRecord1216() {
		assertEquals("http://www.altheaportalatin.com", customers.get(1215).getWeb());
	}
}
