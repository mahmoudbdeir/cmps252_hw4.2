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

@Tag("9")
class Record_3567 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3567: FirstName is Dominic")
	void FirstNameOfRecord3567() {
		assertEquals("Dominic", customers.get(3566).getFirstName());
	}

	@Test
	@DisplayName("Record 3567: LastName is Helmsing")
	void LastNameOfRecord3567() {
		assertEquals("Helmsing", customers.get(3566).getLastName());
	}

	@Test
	@DisplayName("Record 3567: Company is Retherford, Jerry A Esq")
	void CompanyOfRecord3567() {
		assertEquals("Retherford, Jerry A Esq", customers.get(3566).getCompany());
	}

	@Test
	@DisplayName("Record 3567: Address is 520 Main St")
	void AddressOfRecord3567() {
		assertEquals("520 Main St", customers.get(3566).getAddress());
	}

	@Test
	@DisplayName("Record 3567: City is Fort Lee")
	void CityOfRecord3567() {
		assertEquals("Fort Lee", customers.get(3566).getCity());
	}

	@Test
	@DisplayName("Record 3567: County is Bergen")
	void CountyOfRecord3567() {
		assertEquals("Bergen", customers.get(3566).getCounty());
	}

	@Test
	@DisplayName("Record 3567: State is NJ")
	void StateOfRecord3567() {
		assertEquals("NJ", customers.get(3566).getState());
	}

	@Test
	@DisplayName("Record 3567: ZIP is 7024")
	void ZIPOfRecord3567() {
		assertEquals("7024", customers.get(3566).getZIP());
	}

	@Test
	@DisplayName("Record 3567: Phone is 201-461-1690")
	void PhoneOfRecord3567() {
		assertEquals("201-461-1690", customers.get(3566).getPhone());
	}

	@Test
	@DisplayName("Record 3567: Fax is 201-461-3603")
	void FaxOfRecord3567() {
		assertEquals("201-461-3603", customers.get(3566).getFax());
	}

	@Test
	@DisplayName("Record 3567: Email is dominic@helmsing.com")
	void EmailOfRecord3567() {
		assertEquals("dominic@helmsing.com", customers.get(3566).getEmail());
	}

	@Test
	@DisplayName("Record 3567: Web is http://www.dominichelmsing.com")
	void WebOfRecord3567() {
		assertEquals("http://www.dominichelmsing.com", customers.get(3566).getWeb());
	}
}
